package com.survivalcoding.assignments_01_instance.exam01.mock;

import com.survivalcoding.assignments_01_instance.exam01.Healable;

public class TestHealableEntity implements Healable {
    private int hp;

    public TestHealableEntity(int hp) {
        this.hp = hp;
    }

    public static TestHealableEntity createTestLivingEntity() {
        return new TestHealableEntity(100);
    }

    @Override
    public int getHp() {
        return hp;
    }

    @Override
    public void takeDamage(int damage) {
        hp -= damage;
    }

    @Override
    public void beHealed(int amount) {
        this.hp += amount;
    }
}
