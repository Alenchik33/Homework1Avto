package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void AmountAbove1000() {
        assertEquals(service.remain(1100), 900);
    }

    @Test
    public void AmountLess1000() {
        assertEquals(service.remain(900),100);
    }

    @Test
    public void Amount0() {
        assertEquals(service.remain(0), 1000);
    }

    @Test
    public void Amount1000() {
        assertEquals(service.remain(1000), 0);
    }

}
