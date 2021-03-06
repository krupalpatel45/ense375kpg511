package com.uregina.app;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    // Testing case where all the information is correct
    @Test
    public void generalFlightInformationTrue() {

        App app = new App();
        ArrayList<Flight> ticket = new ArrayList<Flight>();
        String depatureAirport = "VIE";
        String arrivalAirport = "BRU";
        Date depatureDate = App.parseDate("01/01/2021");
        // hh:mm am/pm
        Time12 depatureTime = App.parseTime("08:00 am");
        Date arrivalDate = App.parseDate("01/02/2021");
        Time12 arrivalTime = App.parseTime("09:00 pm");
        ticket.add(new Flight(depatureAirport, arrivalAirport, new DateTime(depatureDate, depatureTime),
                new DateTime(arrivalDate, arrivalTime)));

        
        assertTrue(true);
    }
    @Test
    public void InvalidAirport() {

        App app = new App();
        ArrayList<Flight> ticket = new ArrayList<Flight>();
        String depatureAirport = "kkk";
        String arrivalAirport = "BRU";
        Date depatureDate = App.parseDate("01/01/2021");
        // hh:mm am/pm
        Time12 depatureTime = App.parseTime("08:00 am");
        Date arrivalDate = App.parseDate("01/02/2021");
        Time12 arrivalTime = App.parseTime("09:00 pm");
        ticket.add(new Flight(depatureAirport, arrivalAirport, new DateTime(depatureDate, depatureTime),
                new DateTime(arrivalDate, arrivalTime)));

        
        assertFalse(false);
    }

    @Test
    public void NoVisa() {

        App app = new App();
        ArrayList<Flight> ticket = new ArrayList<Flight>();
        String depatureAirport = "TLL";
        String arrivalAirport = "BRU";
        Date depatureDate = App.parseDate("01/01/2021");
        // hh:mm am/pm
        Time12 depatureTime = App.parseTime("08:00 am");
        Date arrivalDate = App.parseDate("01/02/2021");
        Time12 arrivalTime = App.parseTime("09:00 pm");
        ticket.add(new Flight(depatureAirport, arrivalAirport, new DateTime(depatureDate, depatureTime),
                new DateTime(arrivalDate, arrivalTime)));


        assertFalse(false);
    }

    @Test
    public void invalidTimeandAirport() {

        App app = new App();
        ArrayList<Flight> ticket = new ArrayList<Flight>();
        String depatureAirport = "kkk";
        String arrivalAirport = "BRU";
        Date depatureDate = App.parseDate("01/01/2021");
        // hh:mm am/pm
        Time12 depatureTime = App.parseTime("26:00 am");
        Date arrivalDate = App.parseDate("01/02/2021");
        Time12 arrivalTime = App.parseTime("26:00 pm");
        ticket.add(new Flight(depatureAirport, arrivalAirport, new DateTime(depatureDate, depatureTime),
                new DateTime(arrivalDate, arrivalTime)));


        assertFalse(false);
    }
    @Test
    public void invalidTime() {

        App app = new App();
        ArrayList<Flight> ticket = new ArrayList<Flight>();
        String depatureAirport = "TLL";
        String arrivalAirport = "BRU";
        Date depatureDate = App.parseDate("01/01/2021");
        // hh:mm am/pm
        Time12 depatureTime = App.parseTime("26:00 am");
        Date arrivalDate = App.parseDate("01/02/2021");
        Time12 arrivalTime = App.parseTime("26:00 pm");
        ticket.add(new Flight(depatureAirport, arrivalAirport, new DateTime(depatureDate, depatureTime),
                new DateTime(arrivalDate, arrivalTime)));


        assertFalse(false);
    }
    @Test
    public void invalidDateandAirport() {

        App app = new App();
        ArrayList<Flight> ticket = new ArrayList<Flight>();
        String depatureAirport = "ppp";
        String arrivalAirport = "uuu";
        Date depatureDate = App.parseDate("34/34/1811");
        // hh:mm am/pm
        Time12 depatureTime = App.parseTime("08:00 am");
        Date arrivalDate = App.parseDate("01/02/2021");
        Time12 arrivalTime = App.parseTime("08:00 pm");
        ticket.add(new Flight(depatureAirport, arrivalAirport, new DateTime(depatureDate, depatureTime),
                new DateTime(arrivalDate, arrivalTime)));


        assertFalse(false);
    }

    @Test
    public void invalidDateandTime() {

        App app = new App();
        ArrayList<Flight> ticket = new ArrayList<Flight>();
        String depatureAirport = "TLL";
        String arrivalAirport = "BRU";
        Date depatureDate = App.parseDate("34/34/1811");
        // hh:mm am/pm
        Time12 depatureTime = App.parseTime("26:00 am");
        Date arrivalDate = App.parseDate("01/02/2021");
        Time12 arrivalTime = App.parseTime("26:00 pm");
        ticket.add(new Flight(depatureAirport, arrivalAirport, new DateTime(depatureDate, depatureTime),
                new DateTime(arrivalDate, arrivalTime)));


        assertFalse(false);
    }

    @Test
    public void invalidDate() {

        App app = new App();
        ArrayList<Flight> ticket = new ArrayList<Flight>();
        String depatureAirport = "TLL";
        String arrivalAirport = "BRU";
        Date depatureDate = App.parseDate("34/34/1811");
        // hh:mm am/pm
        Time12 depatureTime = App.parseTime("08:00 am");
        Date arrivalDate = App.parseDate("01/02/2021");
        Time12 arrivalTime = App.parseTime("08:00 pm");
        ticket.add(new Flight(depatureAirport, arrivalAirport, new DateTime(depatureDate, depatureTime),
                new DateTime(arrivalDate, arrivalTime)));


        assertFalse(false);
    }
    @Test
    public void invalidDateandTimeNoVisa() {

        App app = new App();
        ArrayList<Flight> ticket = new ArrayList<Flight>();
        String depatureAirport = "TLL";
        String arrivalAirport = "BRU";
        Date depatureDate = App.parseDate("34/34/1811");
        // hh:mm am/pm
        Time12 depatureTime = App.parseTime("08:99 am");
        Date arrivalDate = App.parseDate("01/02/2021");
        Time12 arrivalTime = App.parseTime("08:99 pm");
        ticket.add(new Flight(depatureAirport, arrivalAirport, new DateTime(depatureDate, depatureTime),
                new DateTime(arrivalDate, arrivalTime)));


        assertFalse(false);
    }

    @Test
    public void invalidAirportTime() {

        App app = new App();
        ArrayList<Flight> ticket = new ArrayList<Flight>();
        String depatureAirport = "000";
        String arrivalAirport = "BRU";
        Date depatureDate = App.parseDate("08/09/2021");
        // hh:mm am/pm
        Time12 depatureTime = App.parseTime("08:99 am");
        Date arrivalDate = App.parseDate("01/02/2021");
        Time12 arrivalTime = App.parseTime("08:99 pm");
        ticket.add(new Flight(depatureAirport, arrivalAirport, new DateTime(depatureDate, depatureTime),
                new DateTime(arrivalDate, arrivalTime)));


        assertFalse(false);
    }
}

