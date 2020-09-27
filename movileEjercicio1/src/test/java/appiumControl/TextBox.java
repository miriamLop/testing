package appiumControl;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.net.MalformedURLException;

/**
 * @author miriam Lopez
 * @date 25/09/2020
 */

public class TextBox extends Control {
    public TextBox(By locator) {
        super(locator);
    }

    public void type(String value) throws MalformedURLException {
        this.findControl();
        this.control.sendKeys(value);
    }
    public void busqueda(String value) throws MalformedURLException {
        this.findControl();
        this.control.sendKeys(value+"\n");


    }
}
