package testBasic;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AddTarea {
    private AppiumDriver driver;
    @Before
    public void before() throws MalformedURLException {
        System.out.println("Iniciando Conexion.....");

        DesiredCapabilities capabilities= new DesiredCapabilities();
        capabilities.setCapability("deviceName","Erick");
        capabilities.setCapability("platformVersion","8.0.0");
        capabilities.setCapability("appPackage","com.vrproductiveapps.whendo");
        capabilities.setCapability("appActivity","com.vrproductiveapps.whendo.ui.HomeActivity");
        capabilities.setCapability("platformName","Android");

        this.driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
       // this.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    }
    @Test
    public void crearTarea(){
        //accion+ ¿Determinar el elemento?+ Donde esta el elemento
        // press boton de adicionar Tares
        this.driver.findElement(By.id("com.vrproductiveapps.whendo:id/fab")).click();
        // adicionar titulo de la tarea
        this.driver.findElement(By.id("com.vrproductiveapps.whendo:id/noteTextTitle")).sendKeys("Tarea4");
        // adicionar una nota
        this.driver.findElement(By.id("com.vrproductiveapps.whendo:id/noteTextNotes")).sendKeys("Realizar Tarea 4");
        // press guardar
        this.driver.findElement(By.id("com.vrproductiveapps.whendo:id/saveItem")).click();

    }
    @After
    public void after(){

        System.out.println("AFTER.....");
        //this.driver.quit();
    }
}
