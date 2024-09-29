package com.gildedrose;

public class BackStageGildedRose extends MainGildedRose {

    public BackStageGildedRose(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        Item item =  super.getItem();
            if (item.sellIn>10)
                super.IncreaseQuality(1);
            else if (item.sellIn> 5)
                super.IncreaseQuality(2);
            else if (item.sellIn > 0)
                super.IncreaseQuality(3);
            else
                item.quality = 0;
            item.sellIn = item.sellIn - 1;
            super.setItem(item);
        }
}
