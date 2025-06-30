package com.survivalcoding.asset;

import java.util.ArrayList;
import java.util.List;

public class AssetMain {
    public static void main(String[] args) {
        Book book = new Book("aa", 10, "bb", "bb", 10.0);
        Computer computer = new Computer("aa", 10, "bb", "bb", 10.0);

        Water water = new Water();

        List<Thing> assets = new ArrayList<>();
        assets.add(book);
        assets.add(computer);
        assets.add(water);
    }
}

class Water implements Thing {
    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public void setWeight(double weight) {

    }
}
