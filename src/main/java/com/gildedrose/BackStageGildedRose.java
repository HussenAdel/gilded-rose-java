package com.gildedrose;

public class BackStageGildedRose extends MainGildedRose {

    public BackStageGildedRose(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        Item item =  super.getItem();
        if (item.sellIn>10)
            super.increaseQuality(1);
        else if (item.sellIn> 5)
            super.increaseQuality(2);
        else if (item.sellIn > 0)
            super.increaseQuality(3);
        else
            item.quality = 0;
        decreaseSellIn();
        super.setItem(item);
        }
}
