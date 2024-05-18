package ru.netology.service;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testZeroToTheBonus() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        org.testng.Assert.assertEquals(service.remain(amount), 0);
    }

    @org.testng.annotations.Test
    public void testMiddleHitToTheBonus() {
        CashbackHackService service = new CashbackHackService();
        int amount = 500;
        org.testng.Assert.assertEquals(service.remain(amount), 500);
    }

    @org.testng.annotations.Test
    public void testFullToGo() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        org.testng.Assert.assertEquals(service.remain(amount), 1000);
    }


}
