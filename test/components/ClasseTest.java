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
public class ClasseTest {
    
    private Classe classeProva;
    
    @Before
    public void setUp() {
        classeProva = new Classe("A", 600);
    }

    /**
     * Test of getNom method, of class Classe.
     */
    @Test
    public void testGetNom() {
        assertEquals("A", classeProva.getNom());
    }

    /**
     * Test of getCapacitat method, of class Classe.
     */
    @Test
    public void testGetCapacitat() {
        assertEquals(600, classeProva.getCapacitat());
    }
    
    @Test
    public void mostrarClasse() {
        assertEquals("\nLa classe A té una capacitat de 600", "\nLa classe " + classeProva.getNom() + " té una capacitat de "+classeProva.getCapacitat());

    }

}
