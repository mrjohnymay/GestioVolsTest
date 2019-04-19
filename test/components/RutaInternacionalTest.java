/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author ianguita
 */
public class RutaInternacionalTest {
    
    private RutaInternacional rutaInternacional;

    @Before //Mètode que s'executa primer
    public void setUp() {
        rutaInternacional = new RutaInternacional("001", "El Prat", "Gatwick", "Espanya", "Regne Unit", 1000);
    }

    @Test
    public void testGetPaisOri() {
        assertEquals("Espanya", rutaInternacional.getPaisOri());
    }

    @Test
    public void testGetContinentDes() {
        assertEquals("Regne Unit", rutaInternacional.getPaisDes());
    }

    @Test
    public void testMostrarComponentRutaIntercontinental() {
        assertEquals("\nLes dades de la ruta amb codi 001 són:", "\nLes dades de la ruta amb codi " + rutaInternacional.getCodi() + " són:");
        assertEquals("\nAeroport d'origen: El Prat", "\nAeroport d'origen: " + rutaInternacional.getAeroportOri());
        assertEquals("\nAeroport de destí: Gatwick", "\nAeroport de destí: " + rutaInternacional.getAeroportDes());
        assertEquals("\nDistància: 1000.0", "\nDistància: " + rutaInternacional.getDistancia());
        assertEquals("\nPaís d'origen: Espanya", "\nPaís d'origen: " + rutaInternacional.getPaisOri());
        assertEquals("\nPaís de destí: Regne Unit", "\nPaís de destí: " + rutaInternacional.getPaisDes());
    }
}
