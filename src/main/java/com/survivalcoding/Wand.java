package com.survivalcoding;

public class Wand {

    private String name; // 지팡이의 이름
    private double power; // 지팡이의 마력

    // NAME 관련 get, set
    public String getName() {
        return name; // 외부에서 Hero.name 메소드를 알 수 있게 해줌
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("이름은 null이 아니어야 함");
        }
        if (name.length() <= 3) {
            throw new IllegalArgumentException("이름이 너무 짧음");
        }

        this.name = name; // 새로운 값을 변경 가능하게 해줌
    }


    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        if (power < 0) {
            // setter 메소드 안에서 값의 타당성 검사
            throw new IllegalArgumentException("power는 음수가 될 수 없다.");
        }
        if (power >= 0.5 && power <= 100.0) {
            // setter 메소드 안에서 값의 타당성 검사
            throw new IllegalArgumentException("power는 음수가 될 수 없다.");
        }
        this.power = power;
    }

}
