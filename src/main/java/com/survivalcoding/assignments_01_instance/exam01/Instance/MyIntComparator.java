package com.survivalcoding.assignments_01_instance.exam01.Instance;

import java.util.Comparator;

public class MyIntComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2){
        return Integer.compare(o1, o2);
    }
}
