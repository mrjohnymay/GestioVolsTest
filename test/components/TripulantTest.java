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
public class TripulantTest {

    private Tripulant tcpTest;
    private TripulantCabina tCabinaTest;
    private Date dataAlta;

    @Before
    public void setUp() {

        tCabinaTest = new TripulantCabina("4609996W", "Alex", 20, 8000, "C");
        tcpTest = new TCP("4609996W", "Alex", 20, 8000);
        tcpTest.setRang("Comandant");
        
        dataAlta = new Date();
    }

    /*TCP*/
    @Test
    public void testGetPassaportTCP() {
        assertEquals("4609996W", tcpTest.getPassaport());
    }

    @Test
    public void testGetNomTCP() {
        assertEquals("Alex", tcpTest.getNom());
    }

    @Test
    public void testGetEdatTCP() {
        assertEquals(20, tcpTest.getEdat());
    }

    @Test
    public void testGetHoresVolTCP() {
        assertEquals(8000, tcpTest.getHoresVol());
    }

    @Test
    public void testGetRangTCP() {
        assertEquals("Comandant", tcpTest.getRang());
    }

    @Test
    public void testGetDataAltaTCP() {
        assertEquals(dataAlta, tcpTest.getDataAlta());
    }

    /*TripulantCabina*/
    @Test
    public void testGetPassaportTripulantCabina() {
        assertEquals("4609996W", tCabinaTest.getPassaport());
    }

    @Test
    public void testGetNomTripulantCabina() {
        assertEquals("Alex", tCabinaTest.getNom());
    }

    @Test
    public void testGetEdatTripulantCabina() {
        assertEquals(20, tCabinaTest.getEdat());
    }

    @Test
    public void testGetHoresVolTripulantCabina() {
        assertEquals(8000, tCabinaTest.getHoresVol());
    }

    @Test
    public void testGetRangTripulantCabina() {
        assertEquals("Comandant", tCabinaTest.getRang());
    }

    @Test
    public void testGetBarresTripulantCabina() {
        assertEquals(4, tCabinaTest.getBarres());
    }

    @Test
    public void testGetDataAltaTripulantCabina() {
        assertEquals(dataAlta, tCabinaTest.getDataAlta());
    }
}
