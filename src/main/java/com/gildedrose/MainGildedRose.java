package com.gildedrose;

public abstract class MainGildedRose {

    private Item item;

    public MainGildedRose(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
    public void increaseQuality(int increaseBy){
        this.item.quality = this.item.quality + increaseBy;
        if (this.item.quality > 50)
            this.item.quality =  50;
    }

    public void decreaseQuality(int decreaseBy){
            this.item.quality = this.item.quality - decreaseBy;
        if (this.item.quality < 0)
            this.item.quality = 0;
    }

    public void decreaseSellIn()
    {
        item.sellIn = item.sellIn - 1;
    }




    public abstract void updateQuality();
}
