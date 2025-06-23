package com.survivalcoding;
import java.util.Random;

public class Cleric {
        // 클레릭 이름
        String name;

        // 최대 HP & 최대 MP 상수 필드로 선언
        public static final int MAX_HP = 50;
        public static final int MAX_MP = 10;

        // 클레릭 HP & MP 정수로 초기 치 맥스로 대입
        int hp = MAX_HP;
        int mp = MAX_MP;


        Cleric(String name, int hp, int mp) {
                this.name = name;
                this.hp = hp;
                this.mp = mp;
        }

        Cleric(String name, int hp) {
                this.name = name;
                this.hp = hp;
        }

        Cleric(String name) {
                this.name = name;
        }

        public void print () {
                System.out.println("\n이름: " + name);
                System.out.println("HP: " + hp);
                System.out.println("MP: " + mp);
        }

        Random random = new Random();

        // 셀프 에이드 마법으로 MP - 5소모 -> MAX_HP 까지 회복
        public void selfAid() {
                // MAX_MP = 10 마법 실현 -> 5소모 = MAX_MP - mp 5 = 마나 5
                // hp = MAX_HP;
                // MAX_MP = 5 마법 실현 -> MAX_MP - mp 5 = 마나 0
                this.mp -= 5;
                // System.out.println(this.name + "셀프 에이드를 사용했다!" + this.mp + "마나 5를 소모");
                this.hp = MAX_HP;
                // System.out.println(this.name + "HP가 전부 회복되었다!");
        }

        public int pray(int sec) {
                // 기도한 초만큼 랜덤하게 MP를 회복
                this.mp += sec;
                // 초 만큼 랜덤 수 증가
                int recover = random.nextInt(3) * sec;
                int Recovers = Math.min(recover, MAX_MP - mp);
                mp += Recovers;
                return Recovers;
        }
}
