package com.survivalcoding.assignments_01_instance.exam01.ab;

//자산(Asset)의 일종이며, 형태가 있는 것(Thing)의 일종이다
// 이 정의에 맞도록 TangibleAsset 소스 코드 수정, 필드나 메소드의 추가가 필요하다면 추가
//Computer, Book의 부모 클래스

public class TangibleAsset extends Asset implements Thing {
    private double weight;

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
