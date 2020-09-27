package appiumControl;

import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class RadioButton extends Control{
    public RadioButton(By locator) {
        super(locator);
    }
  public void clickRadio() throws MalformedURLException {
      this.findControl();
      this.control.click();


  }
}
