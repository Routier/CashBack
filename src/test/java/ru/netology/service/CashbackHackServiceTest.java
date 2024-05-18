package ru.netology.service;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void testZeroToTheBonus() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        org.junit.Assert.assertEquals(0, service.remain(amount));
    }

    @org.junit.Test
    public void testMiddleHitToTheBonus() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        org.junit.Assert.assertEquals(500, service.remain(amount));
    }

    @org.junit.Test
    public void testFullToGo() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        org.junit.Assert.assertEquals(1000, service.remain(amount));
    }


}
