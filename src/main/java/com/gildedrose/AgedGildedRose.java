package com.gildedrose;

public class AgedGildedRose extends MainGildedRose {

    public AgedGildedRose(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        Item item =  super.getItem();
            if (item.sellIn == 0)
                super.IncreaseQuality(2);
            else
                super.IncreaseQuality(1);
            item.sellIn = item.sellIn - 1;
            super.setItem(item);
        }
}
