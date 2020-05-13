package cn.xpbootcamp.gildedrose;

import org.junit.Assert;
import org.junit.Test;

import static cn.xpbootcamp.gildedrose.GildedRose.GoodType.*;

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

    @Test
    public void given_a_aged_brie_and_value_and_sellIn_less_than_sellIn_when_given_today_then_output_value()
    {
        GildedRose gildedRose = new GildedRose();
        gildedRose.SellIn = 5;
        gildedRose.goodType = AgedBrie;
        gildedRose.Quality = 3;
        int value = gildedRose.getCurrentValue(1);
        Assert.assertEquals(3,value);
        value = gildedRose.getCurrentValue(2);
        Assert.assertEquals(4,value);
    }

    @Test
    public void given_a_aged_brie_and_value_and_sellIn_bigger_than_sellIn_when_given_today_then_output_value(){
        GildedRose gildedRose = new GildedRose();
        gildedRose.SellIn = 5;
        gildedRose.goodType = AgedBrie;
        gildedRose.Quality = 3;
        int value = gildedRose.getCurrentValue(6);
        Assert.assertEquals(9,value);
        value = gildedRose.getCurrentValue(7);
        Assert.assertEquals(11,value);
    }

    @Test
    public void given_a_backstage_pass_and_value_and_sellIn_bigger_than_sellInwhen_given_today_then_output_value(){
        GildedRose gildedRose = new GildedRose();
        gildedRose.SellIn = 15;
        gildedRose.goodType = BackstagePass;
        gildedRose.Quality = 3;
        int value = gildedRose.getCurrentValue(16);
        Assert.assertEquals(0,value);
        value = gildedRose.getCurrentValue(20);
        Assert.assertEquals(0,value);
    }

    @Test
    public void given_a_backstage_pass_and_value_and_sellIn_between_5_and_10_when_given_today_then_output_value(){
        GildedRose gildedRose = new GildedRose();
        gildedRose.SellIn = 15;
        gildedRose.goodType = BackstagePass;
        gildedRose.Quality = 3;
        int value = gildedRose.getCurrentValue(5);
        Assert.assertEquals(7,value);
        value = gildedRose.getCurrentValue(6);
        Assert.assertEquals(9,value);
    }

    @Test
    public void given_a_backstage_pass_and_value_and_sellIn_between_0_and_5_when_given_today_then_output_value(){
        GildedRose gildedRose = new GildedRose();
        gildedRose.SellIn = 15;
        gildedRose.goodType = BackstagePass;
        gildedRose.Quality = 3;
        int value = gildedRose.getCurrentValue(11);
        Assert.assertEquals(20,value);
        value = gildedRose.getCurrentValue(12);
        Assert.assertEquals(23,value);
    }

}
