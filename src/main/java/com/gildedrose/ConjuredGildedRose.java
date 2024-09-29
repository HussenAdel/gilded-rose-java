package com.gildedrose;

public class ConjuredGildedRose extends MainGildedRose {

    public ConjuredGildedRose(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        Item item =  super.getItem();
        if (item.sellIn != 0)
            super.DecreaseQuality(2);
        else
            super.DecreaseQuality(4);
        item.sellIn = item.sellIn - 1;
        super.setItem(item);
        }
}
