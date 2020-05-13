package cn.xpbootcamp.gildedrose;

import org.junit.Assert;
import org.junit.Test;

import static cn.xpbootcamp.gildedrose.GildedRose.GoodType.Sulfuras;

public class GildedRoseTest {

    @Test
    public void given_a_good_and_value_and_sellIn_when_given_today_then_output_value()
    {
        GildedRose gildedRose = new GildedRose();
        gildedRose.SellIn = 10;
        gildedRose.Quality = 3;
        int value = gildedRose.getCurrentValue(1);
        Assert.assertEquals(3,value);
        value = gildedRose.getCurrentValue(2);
        Assert.assertEquals(4,value);
    }

    @Test
    public void given_a_good_and_value_and_sellIn_when_given_today_bigger_than_sellIn_then_output_value()
    {
        GildedRose gildedRose = new GildedRose();
        gildedRose.SellIn = 10;
        gildedRose.Quality = 3;
        int value = gildedRose.getCurrentValue(11);
        Assert.assertEquals(10,value);
        value = gildedRose.getCurrentValue(12);
        Assert.assertEquals(8,value);
    }

    @Test
    public void given_a_Sulfuras_and_value_and_sellIn_when_given_today_then_output_value()
    {
        GildedRose gildedRose = new GildedRose();
        gildedRose.goodType = Sulfuras;
        gildedRose.Quality = 3;
        int value = gildedRose.getCurrentValue(5);
        Assert.assertEquals(3,value);
        value = gildedRose.getCurrentValue(12);
        Assert.assertEquals(3,value);
    }

}
