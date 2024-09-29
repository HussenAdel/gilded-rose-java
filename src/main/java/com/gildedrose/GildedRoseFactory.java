package com.gildedrose;


public class GildedRoseFactory {

    public static MainGildedRose createGildedRose(Item item) {
        if (item.name.equals(ItemName.AGED_BRIE.name)) {
            return new AgedGildedRose(item);
        } else if (item.name.equals(ItemName.SULFURAS.name)) {
            return new SulfurasGildedRose(item);
        } else if (item.name.equals(ItemName.BACKSTAGE.name)) {
            return new BackStageGildedRose(item);
        } else if (item.name.equals(ItemName.CONJURED.name)) {
            return new ConjuredGildedRose(item);
        } else {
            return new DefaultGildedRose(item);
        }
    }
}
