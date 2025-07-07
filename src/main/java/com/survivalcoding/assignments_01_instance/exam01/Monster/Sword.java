package com.survivalcoding.assignments_01_instance.exam01.Monster;

public class Sword {
    public String name;
    public int damage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }

    Sword(){
       name="";
   }

   public Sword(String name) {
       this.name=name;
       damage=10;
   }

   public static void main(String[] args){
       Sword sword=new Sword("엑스칼리버");
       Sword sword2=new Sword();

       System.out.println(sword.name);
       System.out.println(sword.damage);
   }
}
