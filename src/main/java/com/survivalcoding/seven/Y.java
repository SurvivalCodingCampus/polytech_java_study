package com.survivalcoding.seven;

import java.util.ArrayList;
import java.util.List;

public abstract class Y implements X {
    public abstract void a();

    public abstract void b();

    public static void main(String[] args) {
        List<Y> list = new ArrayList<>();
        list.add(new A() {
        });
        list.add(new B() {
        });
        for (Y y : list) {
            y.b();
        }
    }
}

