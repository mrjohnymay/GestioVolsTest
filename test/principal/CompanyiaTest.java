/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import components.Avio;
import components.TCP;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alex
 */
public class CompanyiaTest {

    private Companyia companyiaTest;
    private Component [] components;

    @Before
    public void setUp() throws ParseException {
        companyiaTest = new Companyia("Larafilms");
        components = new Component[]{new Avio("AB123", "Airbus", "R234", 600), new TCP("4609996W", "Alex", 20, 8000), new Vol("AB048", new SimpleDateFormat("dd-MM-yyyy").parse("16-08-2020"), new SimpleDateFormat("dd-MM-yyyy").parse("17-08-2020"), LocalTime.of(7, 50, 0, 0), LocalTime.of(2, 0, 0, 0))};
        companyiaTest.setComponents(components);
    }

    /**
     * Test of getCodi method, of class Companyia.
     */
    @Test
    public void testGetCodi() {
        assertEquals(1, companyiaTest.getCodi());
    }

    /**
     * Test of getProperCodi method, of class Companyia.
     */
    @Test
    public void testGetProperCodi() {
        assertEquals(3, Companyia.getProperCodi());
    }
    
    /**
     * Test of getNom method, of class Companyia.
     */
    @Test
    public void testGetNom() {
        assertEquals("Larafilms", companyiaTest.getNom());
    }

    /**
     * Test of getComponents method, of class Companyia.
     */
    @Test
    public void testGetComponents() {
        Assert.assertArrayEquals(components, companyiaTest.getComponents());
    }

    /**
     * Test of getPosicioComponents method, of class Companyia.
     */
    @Test
    public void testGetPosicioComponents() {
        assertEquals(0, companyiaTest.getPosicioComponents());
    }

    /**
     * Test of seleccionarComponent method, of class Companyia.
     */
    @Test
    public void testSeleccionarComponent() {
        companyiaTest.setPosicioComponents(companyiaTest.getComponents().length);
        assertEquals(0, companyiaTest.seleccionarComponent(1, "AB123"));
    }


}
