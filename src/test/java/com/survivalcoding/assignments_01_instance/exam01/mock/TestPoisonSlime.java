package com.survivalcoding.assignments_01_instance.exam01.mock;

import com.survivalcoding.assignments_01_instance.exam01.PoisonSlime;

public class TestPoisonSlime extends PoisonSlime {

    public TestPoisonSlime(String suffix, int hp, int pointCount) {
        super(suffix, hp, pointCount);
    }

    public static PoisonSlime createZeroCountSlime(){
        return new TestPoisonSlime("test",100, 0);
    }

}
