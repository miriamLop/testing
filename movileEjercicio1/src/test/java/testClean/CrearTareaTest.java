package testClean;

import activity.busquedaTarea.BusquedaActivity;
import activity.crearTarea.MainActivity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sessionManager.Session;

import java.net.MalformedURLException;

public class CrearTareaTest {
    MainActivity mainActivity=new MainActivity();

    @Test
    public void verifiAddTarea() throws MalformedURLException {
        String tarea="Tarea1";
      mainActivity.adicionButton.click();
      mainActivity.tituloTxt.type(tarea);
      mainActivity.notasTxt.type("Creacion Tare1");
       mainActivity.guardarButton.click();
      //verificacion
        Assert.assertTrue("ERROR, el contacto no esta creado",mainActivity.isDisplayedTarea(tarea));
    }
   /* @Test
    public void buscarTarea()throws MalformedURLException{
        String buscar="Tarea1";
        busquedaActivity.busquedaButton.click();
        busquedaActivity.tareaName.busqueda(buscar);
        //verificacion
        Assert.assertTrue("ERROR, la tarea no existe",busquedaActivity.isDisplayedTarea(buscar));

    }*/
    @After
    public void after() throws MalformedURLException {
        System.out.println("Cerrando aplicacion");
        Session.getInstance().closeSession();
    }
}
