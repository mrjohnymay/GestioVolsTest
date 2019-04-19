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
public class RutaTest {

    Ruta rutaNacional, rutaInternacional, rutaIntercontinental, rutaTransoceanica;

    @Before
    public void setUp() {
        rutaNacional = new RutaNacional("000", "Espanya", "El Prat", "Barajas", 500);
        rutaInternacional = new RutaInternacional("001", "El Prat", "Gatwick", "Espanya", "Regne Unit", 1000);
        rutaIntercontinental = new RutaIntercontinental("002", "El Prat", "Fukuoka", "Espanya", "Japó", "Europa", "Asia", 10000);
        rutaTransoceanica = new RutaTransoceanica("003", "El Prat", "JFK", "Espanya", "USA", "Europa", "America", "Atlàntic", 6000);
    }

    @Test
    public void testGetCodiRutaNacional() {
        assertEquals("000", rutaNacional.getCodi());
    }
    @Test
    public void testGetCodiRutaInternacional() {
        assertEquals("001", rutaInternacional.getCodi());
    }
    @Test
    public void testGetCodiRutaIntercontinental() {
        assertEquals("002", rutaIntercontinental.getCodi());
    }
    @Test
    public void testGetCodiTransoceanica() {
        assertEquals("003", rutaTransoceanica.getCodi());
    }

    @Test
    public void testGetAeroportOriRutaNacional() {
        assertEquals("El Prat", rutaNacional.getAeroportOri());
    }
    @Test
    public void testGetAeroportOriRutaInternacional() {
        assertEquals("El Prat", rutaInternacional.getAeroportOri());
    }
    @Test
    public void testGetAeroportOriRutaIntercontinental() {
        assertEquals("El Prat", rutaIntercontinental.getAeroportOri());
    }
    @Test
    public void testGetAeroportOriRutaTransoceanica() {
        assertEquals("El Prat", rutaTransoceanica.getAeroportOri());
    }

    @Test
    public void testGetAeroportDesRutaNacional() {
        assertEquals("Barajas", rutaNacional.getAeroportDes());
    }
    @Test
    public void testGetAeroportDesRutaInternacional() {
        assertEquals("Gatwick", rutaInternacional.getAeroportDes());
    }
    @Test
    public void testGetAeroportDesRutaIntercontinental() {
        assertEquals("Fukuoka", rutaIntercontinental.getAeroportDes());
    }
    @Test
    public void testGetAeroportDesRutaTransoceanica() {
        assertEquals("JFK", rutaTransoceanica.getAeroportDes());
    }

    @Test
    public void testGetDistanciaRutaNacional() {
        assertEquals(500, rutaNacional.getDistancia(), 0);
    }
    @Test
    public void testGetDistanciaRutainternacional() {
        assertEquals(1000, rutaInternacional.getDistancia(), 0);
    }
    @Test
    public void testGetDistanciaRutaIntercontinental() {
        assertEquals(10000, rutaIntercontinental.getDistancia(), 0);
    }
    @Test
    public void testGetDistanciaRutaTransoceanica() {
        assertEquals(6000, rutaTransoceanica.getDistancia(), 0);
    }

    @Test
    public void testMostrarComponentRutaNacional() {
        assertEquals("\nLes dades de la ruta amb codi 000 són:", "\nLes dades de la ruta amb codi " + rutaNacional.getCodi() + " són:");
        assertEquals("\nAeroport d'origen: El Prat", "\nAeroport d'origen: " + rutaNacional.getAeroportOri());
        assertEquals("\nAeroport de destí: Barajas", "\nAeroport de destí: " + rutaNacional.getAeroportDes());
        assertEquals("\nDistància: 500.0", "\nDistància: " + rutaNacional.getDistancia());
    }
    @Test
    public void testMostrarComponentRutaInternacional() {
        assertEquals("\nLes dades de la ruta amb codi 001 són:", "\nLes dades de la ruta amb codi " + rutaInternacional.getCodi() + " són:");
        assertEquals("\nAeroport d'origen: El Prat", "\nAeroport d'origen: " + rutaInternacional.getAeroportOri());
        assertEquals("\nAeroport de destí: Gatwick", "\nAeroport de destí: " + rutaInternacional.getAeroportDes());
        assertEquals("\nDistància: 1000.0", "\nDistància: " + rutaInternacional.getDistancia());
    }
    @Test
    public void testMostrarComponentRutaIntercontinental() {
        assertEquals("\nLes dades de la ruta amb codi 002 són:", "\nLes dades de la ruta amb codi " + rutaIntercontinental.getCodi() + " són:");
        assertEquals("\nAeroport d'origen: El Prat", "\nAeroport d'origen: " + rutaIntercontinental.getAeroportOri());
        assertEquals("\nAeroport de destí: Fukuoka", "\nAeroport de destí: " + rutaIntercontinental.getAeroportDes());
        assertEquals("\nDistància: 10000.0", "\nDistància: " + rutaIntercontinental.getDistancia());
    }
    @Test
    public void testMostrarComponentRutaTransoceanica() {
        assertEquals("\nLes dades de la ruta amb codi 003 són:", "\nLes dades de la ruta amb codi " + rutaTransoceanica.getCodi() + " són:");
        assertEquals("\nAeroport d'origen: El Prat", "\nAeroport d'origen: " + rutaTransoceanica.getAeroportOri());
        assertEquals("\nAeroport de destí: JFK", "\nAeroport de destí: " + rutaTransoceanica.getAeroportDes());
        assertEquals("\nDistància: 6000.0", "\nDistància: " + rutaTransoceanica.getDistancia());
    }
}
