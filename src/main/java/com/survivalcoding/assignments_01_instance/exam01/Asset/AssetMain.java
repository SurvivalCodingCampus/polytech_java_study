package com.survivalcoding.assignments_01_instance.exam01.Asset;

import java.util.ArrayList;
import java.util.List;

public class AssetMain {
    public static void main(String[] args) {
        Book book = new Book("책", 10, "bb", 10.0, "Afwfewf");
        Computer computer = new Computer("컴퓨터", 10, "bb", 10.0, "bb");

        Water water = new Water();

        List<Asset> assets = new ArrayList<>();
        assets.add(book);
        assets.add(computer);

        for (Asset asset : assets){
            System.out.println(asset.getName());

            if(asset instanceof Book){
                Book bookAsset = (Book) asset;
                System.out.println(bookAsset.getIsbn());
            } else if(asset instanceof Computer){
                Computer computerAsset = (Computer) asset;
                System.out.println(computerAsset.getMakerName());
                }
            }
        }
    }
    interface Liquid{

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