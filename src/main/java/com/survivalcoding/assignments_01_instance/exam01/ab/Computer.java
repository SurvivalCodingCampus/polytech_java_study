package com.survivalcoding.assignments_01_instance.exam01.ab;

//유형자산 (TangibleAsset)이 부모 클래스

public class Computer extends TangibleAsset {

    public Computer(){
        super();
    }

    public Computer(String name, int price, String color, double weight, String makerName){
        super(name, price, color, weight);
        this.makerName=makerName;
    }
    private String makerName;

    public String getMakerName() {
        return makerName;
    }

    public void setMakerName(String makerName) {
        this.makerName = makerName;
    }
}
