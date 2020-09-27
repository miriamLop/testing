package activity.crearTarea;

import appiumControl.Button;
import appiumControl.Label;
import appiumControl.TextBox;
import org.openqa.selenium.By;

/**
 * @author Miriam Lopez
 * @date 25/09/2020
 */

public class MainActivity {
    //atributos para definir los localizadores de Adicionar Tarea
    public Button adicionButton;
    public TextBox tituloTxt;
    public TextBox notasTxt;
    public Button guardarButton;


    public MainActivity() {
        adicionButton=new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
        tituloTxt=new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
        notasTxt=new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
        guardarButton=new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
    }
    //ver si se despliega la tarea creada
    public boolean isDisplayedTarea(String tarea)  {
        String locator="//android.widget.TextView[@text='"+tarea+"']";
        Label addTarea = new Label(By.xpath(locator));
        return addTarea.isDisplayed();
    }
}
