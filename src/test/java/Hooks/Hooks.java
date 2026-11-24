package Hooks;

import Base.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

    @Before(order =0)
    public void launchBrowser(){
        setup();
    }

    @After
    public void closeBrowser(){
        tearDown();
    }
}
