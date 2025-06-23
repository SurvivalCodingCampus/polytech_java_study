package com.survivalcoding.assignments_01_instance.exam01;

public class GreatWizard extends Wizard {
    private int mp = 150;

    public GreatWizard(String name, int hp, Wand wand) {
        super(name, hp, wand);
    }

    @Override
    public int getMp() {
        return mp;
    }

    @Override
    public void setMp(int mp) {
        this.mp = 150;
    }
}
