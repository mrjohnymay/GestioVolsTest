/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import java.util.Date;
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
public class TripulantCabinaTest {
    
    private TripulantCabina tCabinaTest;
    private Date dataAlta;
    
    @Before
    public void setUp() {
        tCabinaTest = new TripulantCabina("4609996W", "Alex", 20, 8000, "C");
        dataAlta = new Date();
    }
    
    @Test
    public void testGetPassaport() {
        assertEquals("4609996W", tCabinaTest.getPassaport());
    }
    
    @Test
    public void testGetNom() {
        assertEquals("Alex", tCabinaTest.getNom());
    }
    @Test
    public void testGetEdat() {
        assertEquals(20, tCabinaTest.getEdat());
    }
    @Test
    public void testGetHoresVol() {
        assertEquals(8000, tCabinaTest.getHoresVol());
    }
    @Test
    public void testGetRang() {
        assertEquals("Comandant", tCabinaTest.getRang());
    }

    @Test
    public void testGetBarres() {
        assertEquals(4, tCabinaTest.getBarres());
    }

    @Test
    public void testGetDataAlta() {
        assertEquals(dataAlta, tCabinaTest.getDataAlta());
    }
    
}
