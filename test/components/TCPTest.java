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
public class TCPTest {
    
    private TCP tcpTest;
    
    @Before
    public void setUp() {
        tcpTest = new TCP("4609996W", "Alex", 20, 8000);
        tcpTest.setRang("Comandant");
    }
    
    @Test
    public void testMostrarComponent() {
        assertEquals("\nLes dades del tripulant de cabina amb passaport 4609996W són:", "\nLes dades del tripulant de cabina amb passaport " + tcpTest.getPassaport() + " són:");
        assertEquals("\nNom: Alex", "\nNom: " + tcpTest.getNom());
        assertEquals("\nEdat: 20", "\nEdat: " + tcpTest.getEdat());
        assertEquals("\nData d'alta: " + new SimpleDateFormat("dd-MM-yyyy").format(new Date()), "\nData d'alta: " + new SimpleDateFormat("dd-MM-yyyy").format(tcpTest.getDataAlta()));
        assertEquals("\nHores de vol: 8000", "\nHores de vol: "+ tcpTest.getHoresVol());
        assertEquals("\nRang: Comandant", "\nRang: "+tcpTest.getRang());
    }
    
}
