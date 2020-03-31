
/**
 * @author rahul.kumar
 * @version $Id: TestNgAnnotationsSequence.java, v 0.1 2020-03-31 23:04 rahul.kumar Exp $$
 */
public class TestNgAnnotationsSequence {


    public static void main(String[] args){


        /**
         * Configuration annotations are all the annotations that start with @Before or @After. Each of these methods defines events in the TestNG lifecycle. As we saw in the previous section, TestNG defines five different configuration annotations. Every time a method is annotated with one of these annotations, it will be run at the following time:
         *
         * ■ @BeforeSuite / @AfterSuite—before a suite starts / after all the test methods in a certain suite have been run
         *
         *
         *
         * ■ @BeforeTest / @AfterTest—before a test starts / after all the test meth- ods in a certain test have been run (remember that a test is made of one or more classes)
         *
         *
         *
         * ■ @BeforeClass / @AfterClass—before a test class starts / after all the test methods in a certain class have been run
         *
         *
         *
         *
         *
         * ■ @BeforeMethod / @AfterMethod—before a test method is run / after a
         *
         * test method has been run
         *
         * ■ @BeforeGroups / @AfterGroups—before any test method in a given
         *
         * group is run / after all the test methods in a given group have been run
         *
         * As we will see in the following chapters, configuration annotations offer a very flexible and granular way to initialize and clean up your tests.
         *
         *
         */
    }
}