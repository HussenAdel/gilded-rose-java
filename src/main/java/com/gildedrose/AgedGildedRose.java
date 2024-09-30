package com.gildedrose;

public class AgedGildedRose extends MainGildedRose {

    public AgedGildedRose(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        if (super.getItem().sellIn == 0)
            super.increaseQuality(2);
        else
            super.increaseQuality(1);
        decreaseSellIn();
        }
}
