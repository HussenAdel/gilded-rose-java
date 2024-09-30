package com.gildedrose;

public class DefaultGildedRose extends MainGildedRose {

    public DefaultGildedRose(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        if (super.getItem().sellIn != 0)
            super.decreaseQuality(1);
        else
            super.decreaseQuality(2);
        decreaseSellIn();
    }
}
