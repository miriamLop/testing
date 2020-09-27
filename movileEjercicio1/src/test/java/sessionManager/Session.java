package sessionManager;

import deviceFactory.FactoryDevice;
import io.appium.java_client.AppiumDriver;
import java.net.MalformedURLException;

/**
 * @author Miriam Lopez
 * @date 25/09/2020
 */

public class Session {
    private static Session session=null;
    private AppiumDriver driver;

    private Session()throws MalformedURLException{
        //conexion al device
        driver= FactoryDevice.make("android").create();
    }
    public static Session getInstance()throws MalformedURLException{
        if (session==null)
            session=new Session();
        return session;
    }
    public void closeSession(){
        driver.quit();
        session=null;
    }
    //get del Driver
    public AppiumDriver getDriver() {
        return driver;
    }
}
