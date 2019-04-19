/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alex
 */
public class AvioTest {

    private Avio avioProva;

    @Before
    public void setUp() {
        avioProva = new Avio("AB123", "Airbus", "R234", 600);
        Classe classes[] = {new Classe("A", 500), new Classe("B", 250)};
        avioProva.setClasses(classes);
    }

    /**
     * Test of getCodi method, of class Avió.
     */
    @Test
    public void testGetCodi() {
        assertEquals("AB123", avioProva.getCodi());
    }

    /**
     * Test of getFabricant method, of class Avio.
     */
    @Test
    public void testGetFabricant() {
        assertEquals("Airbus", avioProva.getFabricant());
    }

    /**
     * Test of getModel method, of class Avio.
     */
    @Test
    public void testGetModel() {
        assertEquals("R234", avioProva.getModel());
    }

    /**
     * Test of getCapacitat method, of class Avio.
     */
    @Test
    public void testGetCapacitat() {
        assertEquals(600, avioProva.getCapacitat());
    }

    /**
     * Test of getClasses method, of class Avio.
     */
    @Test
    public void testGetClasses() {
        assertEquals("A", avioProva.getClasses()[0].getNom());
        assertEquals(500, avioProva.getClasses()[0].getCapacitat());
        assertEquals("B", avioProva.getClasses()[1].getNom());
        assertEquals(250, avioProva.getClasses()[1].getCapacitat());
    }

    /**
     * Test of getPosicioClasses method, of class Avio.
     */
    @Test
    public void testGetPosicioClasses() {
        avioProva.setPosicioClasses(2);
        assertEquals(2, avioProva.getPosicioClasses());
    }

    /**
     * Test of seleccionarClasse method, of class Avio.
     */
    @Test
    public void testSeleccionarClasse() {
        avioProva.setPosicioClasses(2);
        assertEquals(0, avioProva.seleccionarClasse("A"));
    }
    
    @Test
    public void mostrarAvio() {
        assertEquals("\nLes dades de l'avió amb codi AB123 són:", "\nLes dades de l'avió amb codi " + avioProva.getCodi() + " són:");
        assertEquals("\nFabricant: Airbus","\nFabricant: " + avioProva.getFabricant());
        assertEquals("\nModel: R234", "\nModel: " + avioProva.getModel());
        assertEquals("\nCapacitat: 600", "\nCapacitat: " + avioProva.getCapacitat());
    }

}
