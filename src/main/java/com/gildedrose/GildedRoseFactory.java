package com.gildedrose;

public class GildedRoseFactory {
        public static MainGildedRose createGildedRose(Item item) {
            switch (item.name) {
                case "Aged Brie":
                    return new AgedGildedRose(item);
                case "Sulfuras, Hand of Ragnaros":
                    return new SulfurasGildedRose(item);
                case "Backstage passes to a TAFKAL80ETC concert":
                    return new BackStageGildedRose(item);
                default:
                    return new DefaultGildedRose(item);
            }
        }
}
