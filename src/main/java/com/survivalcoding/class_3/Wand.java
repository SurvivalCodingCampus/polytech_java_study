package com.survivalcoding.class_3;

public class Wand {
    private String name; // 지팡이의 이름
    private double power; // 지팡이의 마력

    public Wand() {
        this("기본지팡이", 10);
    }
    public Wand(String name, double power) {
        setName(name);
        setPower(power);
    }

    // getter
    public String getName() {
        return name;
    }
    public double getPower() {
        return power;
    }

    //setter
    public void setName(String name) {
        if(name==null){
            throw new IllegalArgumentException("이름은 null이 아니어야 함");
        }
        if(name.length()<3) {
            throw new IllegalArgumentException("이름은 3문자 이상이어야 함");
        }
        this.name = name;
    }

    public void setPower(double power) {
        if(!(power >= 0.5 && power <= 100)){
            throw new IllegalArgumentException("지팡이의 마력은 0.5 이상 100.0 이하여야 함");
        }
        this.power = power;
    }

}
