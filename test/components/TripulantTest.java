/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Before;
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
        tcpTest = new TCP("56089997W", "Ivan", 20, 8000);
        tcpTest.setRang("Comandant");

        dataAlta = new Date();
    }

    /*TCP*/
    @Test
    public void testGetPassaportTCP() {
        assertEquals("56089997W", tcpTest.getPassaport());
    }

    @Test
    public void testGetNomTCP() {
        assertEquals("Ivan", tcpTest.getNom());
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

    @Test
    public void testMostrarTCP() {
        assertEquals("\nLes dades del tripulant de cabina amb passaport 56089997W són:", "\nLes dades del tripulant de cabina amb passaport " + tcpTest.getPassaport() + " són:");
        assertEquals("\nNom: Ivan", "\nNom: " + tcpTest.getNom());
        assertEquals("\nEdat: 20", "\nEdat: " + tcpTest.getEdat());
        assertEquals("\nData d'alta: " + new SimpleDateFormat("dd-MM-yyyy").format(new Date()), "\nData d'alta: " + new SimpleDateFormat("dd-MM-yyyy").format(tcpTest.getDataAlta()));
        assertEquals("\nHores de vol: 8000", "\nHores de vol: " + tcpTest.getHoresVol());
        assertEquals("\nRang: Comandant", "\nRang: " + tcpTest.getRang());
    }

    @Test
    public void testMostrarTripulantCabina() {
        assertEquals("\nLes dades del tripulant de cabina amb passaport 4609996W són:", "\nLes dades del tripulant de cabina amb passaport " + tCabinaTest.getPassaport() + " són:");
        assertEquals("\nNom: Alex", "\nNom: " + tCabinaTest.getNom());
        assertEquals("\nEdat: 20", "\nEdat: " + tCabinaTest.getEdat());
        assertEquals("\nData d'alta: " + new SimpleDateFormat("dd-MM-yyyy").format(new Date()), "\nData d'alta: " + new SimpleDateFormat("dd-MM-yyyy").format(tCabinaTest.getDataAlta()));
        assertEquals("\nHores de vol: 8000", "\nHores de vol: "+ tCabinaTest.getHoresVol());
        assertEquals("\nRang: Comandant", "\nRang: "+tCabinaTest.getRang());
        assertEquals("\nBarres: 4", "\nBarres: " + tCabinaTest.getBarres() );
    }
}
