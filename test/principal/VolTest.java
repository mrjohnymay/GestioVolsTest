/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import components.Avio;
import components.Classe;
import components.RutaNacional;
import components.TCP;
import components.TripulantCabina;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Date;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author ianguita
 */
public class VolTest {

    private Vol volTest;
    private RutaNacional rutaTest;
    private Avio avioTest;
    private TripulantCabina tCabinaTest;
    private TCP tcpTest;
    private Date dataArribada;
    private Date dataSortida;
    private LocalTime horaArribada;
    private LocalTime horaSortida;

    @Before
    public void setUp() throws ParseException {

        dataArribada = new SimpleDateFormat("yyyy-MM-dd").parse("2019-04-24");
        dataSortida = new SimpleDateFormat("yyyy-MM-dd").parse("2019-04-24");
        horaArribada = LocalTime.parse("22:00:00");
        horaSortida = LocalTime.parse("20:00:00");

        volTest = new Vol("000",  dataSortida, dataArribada, horaSortida, horaArribada);

        rutaTest = new RutaNacional("000", "Espanya", "El Prat", "Barajas", 500);

        avioTest = new Avio("AB123", "Airbus", "R234", 600);
        Classe classes[] = {new Classe("A", 500), new Classe("B", 250)};
        avioTest.setClasses(classes);

        tCabinaTest = new TripulantCabina("4609996W", "Alex", 20, 8000, "C");

        tcpTest = new TCP("4609996W", "Alex", 20, 8000);
        tcpTest.setRang("Comandant");

        volTest.setRuta(rutaTest);
        volTest.setAvio(avioTest);
        volTest.getTripulacio()[volTest.getPosicioTripulacio()] = tCabinaTest;
        volTest.setPosicioTripulacio(volTest.getPosicioTripulacio() + 1);
        volTest.setCap(tcpTest);
    }

    @Test
    public void testGetCodi() {
        assertEquals("000", volTest.getCodi());
    }

    @Test
    public void testGetRuta() {
        assertEquals(rutaTest, volTest.getRuta());
    }

    @Test
    public void testGetAvio() {
        assertEquals(avioTest, volTest.getAvio());
    }

    @Test
    public void testGetTripulacio() {
        assertEquals(tCabinaTest, volTest.getTripulacio()[0]);
    }

    @Test
    public void testGetPosicioTripulacio() {
        assertEquals(1, volTest.getPosicioTripulacio());
    }

    //Fecha mal
    @Test
    public void testGetDataSortida() throws ParseException {
        assertEquals(dataSortida, volTest.getDataSortida());
    }

    @Test
    public void testGetDataArribada() throws ParseException {
        assertEquals(dataArribada, volTest.getDataArribada());
    }

    @Test
    public void testGetHoraSortida() {
        assertEquals(horaSortida, volTest.getHoraSortida());
    }

    @Test
    public void testGetHoraArribada() {
        assertEquals(horaArribada, volTest.getHoraArribada());
    }

    @Test
    public void testGetDurada() {
        assertEquals(calcularDurada(), volTest.getDurada());
    }

    @Test
    public void testGetCap() {
        assertEquals(tcpTest, volTest.getCap());
    }

    @Test
    public void testMostrarComponent() {
        assertEquals("\nLes dades del vol amb codi 000 són:", "\nLes dades del vol amb codi " + volTest.getCodi() + " són:");

        assertEquals("\nLes dades de la ruta amb codi 000 són:", "\nLes dades de la ruta amb codi " + rutaTest.getCodi() + " són:");
        assertEquals("\nAeroport d'origen: El Prat", "\nAeroport d'origen: " + rutaTest.getAeroportOri());
        assertEquals("\nAeroport de destí: Barajas", "\nAeroport de destí: " + rutaTest.getAeroportDes());
        assertEquals("\nDistància: 500.0", "\nDistància: " + rutaTest.getDistancia());
        assertEquals("\nPaís: Espanya", "\nPaís: " + rutaTest.getPais());

        assertEquals("\nAvio: ", "\nAvio: ");
        assertEquals("\nLes dades de l'avió amb codi AB123 són:", "\nLes dades de l'avió amb codi " + avioTest.getCodi() + " són:");
        assertEquals("\nFabricant: Airbus", "\nFabricant: " + avioTest.getFabricant());
        assertEquals("\nModel: R234", "\nModel: " + avioTest.getModel());
        assertEquals("\nCapacitat: 600", "\nCapacitat: " + avioTest.getCapacitat());

        assertEquals("\nData de sortida: 2019-04-24", "\nData de sortida: " + new SimpleDateFormat("yyyy-MM-dd").format(volTest.getDataSortida()));
        assertEquals("\nData d'arribada: 2019-04-24", "\nData d'arribada: " + new SimpleDateFormat("yyyy-MM-dd").format(volTest.getDataArribada()));
        assertEquals("\nHores de sortida: 20:0", "\nHores de sortida: " + volTest.getHoraSortida().getHour() + ":" + volTest.getHoraSortida().getMinute());
        assertEquals("\nHores d'arribada: 22:0", "\nHores d'arribada: " + volTest.getHoraArribada().getHour() + ":" + volTest.getHoraArribada().getMinute());

        assertEquals("\nLa tripulació de cabina és:", "\nLa tripulació de cabina és:");
        assertEquals("\nLes dades del tripulant de cabina amb passaport 4609996W són:", "\nLes dades del tripulant de cabina amb passaport " + tCabinaTest.getPassaport() + " són:");
        assertEquals("\nNom: Alex", "\nNom: " + tCabinaTest.getNom());
        assertEquals("\nEdat: 20", "\nEdat: " + tCabinaTest.getEdat());
        assertEquals("\nData d'alta: " + new SimpleDateFormat("dd-MM-yyyy").format(new Date()), "\nData d'alta: " + new SimpleDateFormat("dd-MM-yyyy").format(tCabinaTest.getDataAlta()));
        assertEquals("\nHores de vol: 8000", "\nHores de vol: " + tCabinaTest.getHoresVol());
        assertEquals("\nRang: Comandant", "\nRang: " + tCabinaTest.getRang());
        assertEquals("\nBarres: 4", "\nBarres: " + tCabinaTest.getBarres());

        assertEquals("\nLa tripulació de cabina de passatgers és:", "\nLa tripulació de cabina de passatgers és:");
        assertEquals("\nLes dades del tripulant de cabina amb passaport 4609996W són:", "\nLes dades del tripulant de cabina amb passaport " + tcpTest.getPassaport() + " són:");
        assertEquals("\nNom: Alex", "\nNom: " + tcpTest.getNom());
        assertEquals("\nEdat: 20", "\nEdat: " + tcpTest.getEdat());
        assertEquals("\nData d'alta: " + new SimpleDateFormat("dd-MM-yyyy").format(new Date()), "\nData d'alta: " + new SimpleDateFormat("dd-MM-yyyy").format(tcpTest.getDataAlta()));
        assertEquals("\nHores de vol: 8000", "\nHores de vol: " + tcpTest.getHoresVol());
        assertEquals("\nRang: Comandant", "\nRang: " + tcpTest.getRang());

        //System.out.println("\nDurada: " + durada);
    }

    private String calcularDurada() {

        long segonsDurada = (dataArribada.getTime() + (horaArribada.getHour() * 3600 + horaArribada.getMinute() * 60)) - (dataSortida.getTime() + (horaSortida.getHour() * 3600 + horaSortida.getMinute() * 60));

        return (segonsDurada / 3600000) + " h - " + ((segonsDurada - (3600 * (segonsDurada / 3600))) / 60) + " m";
    }
}
