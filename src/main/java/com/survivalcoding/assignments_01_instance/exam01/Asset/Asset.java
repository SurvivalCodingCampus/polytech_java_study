package com.survivalcoding.assignments_01_instance.exam01.Asset;

//무형자산(intangibleAsset), 유형자산 (TangibleAsset)의 부모 클래스

public class Asset {
    private String name;
    private int price;

    public Asset(String name, int price){
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
