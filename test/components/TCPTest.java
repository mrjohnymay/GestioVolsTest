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
public class TCPTest {
    
    private TCP tcpTest;
    private Date dataAlta;
    
    @Before
    public void setUp() {
        tcpTest = new TCP("4609996W", "Alex", 20, 8000);
        dataAlta = new Date();
        tcpTest.setRang("Comandant");
    }
    
    @Test
    public void testGetPassaport() {
        assertEquals("4609996W", tcpTest.getPassaport());
    }
    
    @Test
    public void testGetNom() {
        assertEquals("Alex", tcpTest.getNom());
    }
    @Test
    public void testGetEdat() {
        assertEquals(20, tcpTest.getEdat());
    }
    @Test
    public void testGetHoresVol() {
        assertEquals(8000, tcpTest.getHoresVol());
    }
    @Test
    public void testGetRang() {
        assertEquals("Comandant", tcpTest.getRang());
    }

    @Test
    public void testGetDataAlta() {
        assertEquals(dataAlta, tcpTest.getDataAlta());
    }
    
    
}
