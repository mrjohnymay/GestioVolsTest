/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package components;

import java.text.SimpleDateFormat;
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
    
    @Before
    public void setUp() {
        tCabinaTest = new TripulantCabina("4609996W", "Alex", 20, 8000, "C");
    }

    @Test
    public void testGetBarres() {
        assertEquals(4, tCabinaTest.getBarres());
    }
    
    @Test
    public void testMostrarComponent() {
        assertEquals("\nLes dades del tripulant de cabina amb passaport 4609996W són:", "\nLes dades del tripulant de cabina amb passaport " + tCabinaTest.getPassaport() + " són:");
        assertEquals("\nNom: Alex", "\nNom: " + tCabinaTest.getNom());
        assertEquals("\nEdat: 20", "\nEdat: " + tCabinaTest.getEdat());
        assertEquals("\nData d'alta: " + new SimpleDateFormat("dd-MM-yyyy").format(new Date()), "\nData d'alta: " + new SimpleDateFormat("dd-MM-yyyy").format(tCabinaTest.getDataAlta()));
        assertEquals("\nHores de vol: 8000", "\nHores de vol: "+ tCabinaTest.getHoresVol());
        assertEquals("\nRang: Comandant", "\nRang: "+tCabinaTest.getRang());
        assertEquals("\nBarres: 4", "\nBarres: " + tCabinaTest.getBarres() );
    }
    
    
    
}
