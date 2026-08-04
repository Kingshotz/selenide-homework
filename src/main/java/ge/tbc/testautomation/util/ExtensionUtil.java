package ge.tbc.testautomation.util;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class ExtensionUtil {

    private ExtensionUtil() {
    }

    // Unzip extension
    public static File extractExtension(String resourceName) {
        try (InputStream crx = ExtensionUtil.class.getClassLoader().getResourceAsStream(resourceName)) {
            if (crx == null) {
                throw new IllegalStateException("Extension not found on classpath: " + resourceName);
            }
            Path target = Files.createTempFile("extension", ".crx");
            target.toFile().deleteOnExit();
            Files.copy(crx, target, StandardCopyOption.REPLACE_EXISTING);
            return target.toFile();
        } catch (Exception e) {
            throw new IllegalStateException("Failed to prepare extension: " + resourceName, e);
        }
    }
}
