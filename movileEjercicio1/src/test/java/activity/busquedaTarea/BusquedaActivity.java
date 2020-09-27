package activity.busquedaTarea;

import appiumControl.Button;
import appiumControl.Label;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class BusquedaActivity {
    //atributos para definir los localizadores para buscar una Tarea
    public Button busquedaButton;
    public TextBox tareaName;

    public BusquedaActivity() {
        busquedaButton=new Button(By.id("com.vrproductiveapps.whendo:id/search"));
        tareaName=new TextBox(By.id("com.vrproductiveapps.whendo:id/search_src_text"));
    }
    //ver si se despliega la tarea buscada
    public boolean isDisplayedTarea(String tarea)  {


        String locator="//android.widget.TextView[@text='"+tarea+"']";
        Label addTarea = new Label(By.xpath(locator));
        return addTarea.isDisplayed();
    }

}
