package cn.xpbootcamp.gildedrose;

public class GildedRose {
    private final static int BackstagePass5 = 5;
    private final static int  BackstagePass10 = 10;
    private final static int ValueMin= 0;
    private final static int ValueMax= 50;

    public int SellIn;
    public int Quality;
    public enum GoodType{
        Good,
        Sulfuras,
        AgedBrie,
        BackstagePass,
        other
    }

    public GoodType goodType = GoodType.other;


    public int getCurrentValue(int curdays) {
        int result = 0;
        switch (goodType){
            case Sulfuras:
                result = getSulfurasCurrrentValue(curdays);
                break;
            case AgedBrie:
                result = getAgedBrieCurrrentValue(curdays);
                break;
            case BackstagePass:
                result = getBackstagePassCurrrentValue(curdays);
                break;
            case Good:
            default:
                result = getGoodCurrrentValue(curdays);
        }
        if(result>=ValueMax){
            result = ValueMax;
        }
        else if(result<=ValueMin){
            result = ValueMin;
        }
        return result;


    }

    /* 1  2  3  4  5  6  7   8   9 10 11  12
    * 15 14 13 12 11 10  9   8   7  6  5  4
    * 3  4  5  6  7  9  11   13  15 17 20  23
    *
    *
    * 3 + 4 +     2*1
    * 3 + 15-10+1  +   2 * ()
    * 3 + 4+ 2*5+ 3*1    (11-5-(15-10+1)) = 11-5-6 = 0
    * */
    private int getBackstagePassCurrrentValue(int curdays) {
        int result = 0;
        if(curdays > SellIn){
            result = 0;
        }
        else if(SellIn - (curdays-1) > BackstagePass10){
            result = Quality + curdays - 1;
        }
        else if(SellIn - (curdays-1) > BackstagePass5){
            result = Quality + SellIn-BackstagePass10-1 + 2*(curdays - (SellIn-BackstagePass10));
        }
        else{
            result = Quality + 1*(SellIn-BackstagePass10-1) + 2*(BackstagePass10-BackstagePass5) + 3*(curdays - (SellIn-BackstagePass10) - BackstagePass5);
        }
        return result;
    }

    private int getAgedBrieCurrrentValue(int curdays) {
        int result = 0;
        if(curdays<=SellIn){
            result = Quality + curdays - 1;
        }
        else{
            result = Quality + SellIn - 1 + 2 * (curdays - SellIn);
        }
        return result;
    }

    private int getGoodCurrrentValue(int curdays) {
        int result = 0;
        if(curdays<=SellIn){
            result = Quality + curdays - 1;
        }
        else{
            result = Quality + SellIn - 1 - 2 * (curdays - SellIn);
        }
        return result;
    }

    private int getSulfurasCurrrentValue(int curdays) {
        return Quality;
    }
}
