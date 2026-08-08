package ge.tbc.testautomation.tests;

import org.testng.annotations.Factory;

public class CategoryPagesTestFactory {
    @Factory
    public Object[] swoopFactory(){
        return new Object[]{
                new ParametrizedSwoopTests2("დასვენება", "ფასი-ზრდით", 250, 650),
                new ParametrizedSwoopTests2("გართობა", "ფასი-ზრდით", 130.0, 300.0),
                new ParametrizedSwoopTests2("კვება", "ფასი-კლებით", 80.0, 250.0)
        };
    }
}
