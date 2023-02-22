package stepDefinition;


import base.Config;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends Config {

    // QA: http://www.qa.talektc.com
    // STAGE: http://www.stage.talektc.com
    // PROD: http://www.prod.talektc.com

    public static String url;
    public static String driverType=System.getProperty("browser");
    public static String envType=System.getProperty("env");

    @Before
    public void beforeEachTest(){
        driver=setupBrowser(driverType);
        switch (envType){
            case "qa":
                url="http://www.qa.taltektc.com";
                break;

            case "stage":
                url="http://www.stage.taltektc.com";
                break;

            case "prod":
                url="http://www.prod.taltektc.com";
                break;


        }
        driver.get(url);

    }

    @After
    public void afterEachTest(){

        //driver.quit();
    }




}
