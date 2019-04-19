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
public class RutaNacionalTest {

    private RutaNacional rutaNacional;

    @Before //Mètode que s'executa primer
    public void setUp() {
        rutaNacional = new RutaNacional("000", "Espanya", "El Prat", "Barajas", 500);
    }

    @Test
    public void testGetPais() {
        assertEquals("Espanya", rutaNacional.getPais());
    }

    @Test
    public void testMostrarComponentRutaIntercontinental() {
        assertEquals("\nLes dades de la ruta amb codi 000 són:", "\nLes dades de la ruta amb codi " + rutaNacional.getCodi() + " són:");
        assertEquals("\nAeroport d'origen: El Prat", "\nAeroport d'origen: " + rutaNacional.getAeroportOri());
        assertEquals("\nAeroport de destí: Barajas", "\nAeroport de destí: " + rutaNacional.getAeroportDes());
        assertEquals("\nDistància: 500.0", "\nDistància: " + rutaNacional.getDistancia());
        assertEquals("\nPaís: Espanya", "\nPaís: " + rutaNacional.getPais());
    }
}
