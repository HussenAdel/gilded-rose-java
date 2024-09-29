package com.gildedrose;

public class DefaultGildedRose extends MainGildedRose {

    public DefaultGildedRose(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        Item item =  super.getItem();
        if (item.sellIn != 0)
            super.DecreaseQuality(1);
        else
            super.DecreaseQuality(2);
        item.sellIn = item.sellIn - 1;
        super.setItem(item);
    }
}
