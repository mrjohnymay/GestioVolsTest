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
public class RutaTransoceanicaTest {

    private RutaTransoceanica rutaTransoceanica;

    @Before //Mètode que s'executa primer
    public void setUp() {
        rutaTransoceanica = new RutaTransoceanica("003", "El Prat", "JFK", "Espanya", "USA", "Europa", "America", "Atlàntic", 6000);
    }

    @Test
    public void testGetOcea() {
        assertEquals("Atlàntic", rutaTransoceanica.getOcea());
    }

    @Test
    public void testMostrarComponentRutaTransoceanica() {
        assertEquals("\nLes dades de la ruta amb codi 003 són:", "\nLes dades de la ruta amb codi " + rutaTransoceanica.getCodi() + " són:");
        assertEquals("\nAeroport d'origen: El Prat", "\nAeroport d'origen: " + rutaTransoceanica.getAeroportOri());
        assertEquals("\nAeroport de destí: JFK", "\nAeroport de destí: " + rutaTransoceanica.getAeroportDes());
        assertEquals("\nDistància: 6000.0", "\nDistància: " + rutaTransoceanica.getDistancia());
        assertEquals("\nPaís d'origen: Espanya", "\nPaís d'origen: " + rutaTransoceanica.getPaisOri());
        assertEquals("\nPaís de destí: USA", "\nPaís de destí: " + rutaTransoceanica.getPaisDes());
        assertEquals("\nContinent d'origen: Europa", "\nContinent d'origen: " + rutaTransoceanica.getContinentOri());
        assertEquals("\nContinent de destí: America", "\nContinent de destí: " + rutaTransoceanica.getContinentDes());
        assertEquals("\nOceà que sobrevola: Atlàntic", "\nOceà que sobrevola: " + rutaTransoceanica.getOcea());
    }
}
