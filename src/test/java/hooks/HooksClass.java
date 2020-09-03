package hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass {
@Before("@Smoke")
    public void BeforeMethod(){
    System.out.println("run Before secenario ");
    }
    @After("@Smoke")
    public void AfterMethod(){
        System.out.println("run After secenario ");
    }
}
