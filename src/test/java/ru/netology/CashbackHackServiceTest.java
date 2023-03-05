package ru.netology;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemainIfProbableAmount() {

        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int actual = service.remain(900);

        assertEquals(actual, expected);
    }

    @Test
    public void testRemainIfNull() {

        CashbackHackService service = new CashbackHackService();
        int expected = 1000;
        int actual = service.remain(0);

        assertEquals(actual, expected);
    }

    @Test
    public void testRemainIfMax() {

        CashbackHackService service = new CashbackHackService();
        int expected = 1;
        int actual = service.remain(999);

        assertEquals(actual, expected);
    }

    @Test
    public void testRemainIfMore() {

        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int actual = service.remain(1100);

        assertEquals(actual, expected);
    }
}