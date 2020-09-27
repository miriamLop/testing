package testClean;

import activity.busquedaTarea.BusquedaActivity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sessionManager.Session;

import java.net.MalformedURLException;

/**
 * @author Miriam Lopez
 * @ 25/09/2020
 */

public class BuscarTareaTest {
    BusquedaActivity busquedaActivity=new BusquedaActivity();
    @Test
    public void buscarTarea()throws MalformedURLException {
        String buscar="Tarea1";
        busquedaActivity.busquedaButton.click();
        busquedaActivity.tareaName.busqueda(buscar);
        //verificacion
        Assert.assertTrue("ERROR, la tarea no existe",busquedaActivity.isDisplayedTarea(buscar));

    }
    @After
    public void after() throws MalformedURLException {
        System.out.println("Cerrando aplicacion");

        Session.getInstance().closeSession();
    }
}
