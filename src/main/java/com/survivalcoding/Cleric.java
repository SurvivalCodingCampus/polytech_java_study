package com.survivalcoding;
import java.util.Random;

public class Cleric {
    String name;
    final int MAX_HP = 50;
    final int MAX_MP = 10;
    int mp = MAX_MP;
    int hp = MAX_HP;

    void selfAid(){
        if(mp>=5){
            mp-=5;
            hp=MAX_HP;
            System.out.print("MP를 사용하였습니다.");}
            else{
            System.out.print("MP를 사용할수 없습니다.");
            }
        }
    }





