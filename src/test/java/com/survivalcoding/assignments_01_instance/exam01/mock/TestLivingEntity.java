package com.survivalcoding.assignments_01_instance.exam01.mock;

import com.survivalcoding.assignments_01_instance.exam01.LivingEntity;


public class TestLivingEntity implements LivingEntity {
    private int hp;
    private static final int MAX_HP = 100;
    public TestLivingEntity(int hp) {
        this.hp = hp;
    }

    public static TestLivingEntity createTestLivingEntity() {
        return new TestLivingEntity(100);
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public int getMaxHp() {
        return MAX_HP;
    }

    @Override
    public void takeDamage(int damage) {
        hp -= damage;
    }
}
