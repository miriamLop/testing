package deviceFactory;

import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

/**
 * @autor: Miriam Lopez
 * @date: 25/09/2020
 */

public interface IDevice {
    AppiumDriver create()throws MalformedURLException;
}
