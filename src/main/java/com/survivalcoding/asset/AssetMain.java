package com.survivalcoding.asset;

import java.util.ArrayList;
import java.util.List;

public class AssetMain {
    public static void main(String[] args) {
        Book book = new Book("책", 10, "bb", "a1123123123", 10.0);
        Computer computer = new Computer("컴퓨터", 10, "bb", "bb", 10.0);

        Water water = new Water();

        List<Asset> assets = new ArrayList<>();
        assets.add(book);
        assets.add(computer);

        for (Asset asset : assets) {
            System.out.println(asset.getName());

            if (asset instanceof Book) {
                Book bookAsset = (Book) asset;
                System.out.println(bookAsset.getIsbn());
            } else if (asset instanceof Computer) {
                Computer computerAsset = (Computer) asset;
                System.out.println(computerAsset.getMakerName());
            }
        }
    }
}

// marker interface
interface Liquid {

}

class Water implements Thing, Liquid {
    @Override
    public double getWeight() {
        return 0;
    }

    @Override
    public void setWeight(double weight) {

    }
}
