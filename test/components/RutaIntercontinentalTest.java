/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ianguita
 */
public class RutaIntercontinentalTest {

    private RutaIntercontinental rutaIntercontinental;

    @Before //Mètode que s'executa primer
    public void setUp() {
        rutaIntercontinental = new RutaIntercontinental("002", "El Prat", "Fukuoka", "Espanya", "Japó", "Europa", "Asia", 10000);
    }

    @Test
    public void testGetContinentOri() {
        assertEquals("Europa", rutaIntercontinental.getContinentOri());
    }

    @Test
    public void testGetContinentDes() {
        assertEquals("Asia", rutaIntercontinental.getContinentDes());
    }

    @Test
    public void testMostrarComponentRutaIntercontinental() {
        assertEquals("\nLes dades de la ruta amb codi 002 són:", "\nLes dades de la ruta amb codi " + rutaIntercontinental.getCodi() + " són:");
        assertEquals("\nAeroport d'origen: El Prat", "\nAeroport d'origen: " + rutaIntercontinental.getAeroportOri());
        assertEquals("\nAeroport de destí: Fukuoka", "\nAeroport de destí: " + rutaIntercontinental.getAeroportDes());
        assertEquals("\nDistància: 10000.0", "\nDistància: " + rutaIntercontinental.getDistancia());
        assertEquals("\nPaís d'origen: Espanya", "\nPaís d'origen: " + rutaIntercontinental.getPaisOri());
        assertEquals("\nPaís de destí: Japó", "\nPaís de destí: " + rutaIntercontinental.getPaisDes());
        assertEquals("\nContinent d'origen: Europa", "\nContinent d'origen: " + rutaIntercontinental.getContinentOri());
        assertEquals("\nContinent de destí: Asia", "\nContinent de destí: " + rutaIntercontinental.getContinentDes());
    }
}
