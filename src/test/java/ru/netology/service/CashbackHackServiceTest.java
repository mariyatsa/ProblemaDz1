
package ru.netology.service;

import org.testng.annotations.Test;
import org.testng.Assert;


public class CashbackHackServiceTest {
    @Test
    public void test1() { // Покупка на 900, просит докупить еще на 100
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(900);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void test2() { // Покупка на 800, просит докупить еще на 200
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(800);
        int expected = 200;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void test3() { // Покупка на 1500, просит докупить еще на 500
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1500);
        int expected = 500;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void test4() { // Покупка на 1000 руб. Если пользователь купил ровно на 1000 рублей,
        // то приложение не должно ему говорить, что нужно купить ещё на 1000.
        CashbackHackService service = new CashbackHackService();

        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }
}