package com.gildedrose;

public class ConjuredGildedRose extends MainGildedRose {

    public ConjuredGildedRose(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        if (super.getItem().sellIn != 0)
            super.decreaseQuality(2);
        else
            super.decreaseQuality(4);
        decreaseSellIn();
        }
}
