package com.survivalcoding.list;

import java.util.ArrayList;

public class ListMain {
    public static void main(String[] args) {
        // 같은 타입을 담을 수 있는 목록
        final ArrayList<String> names = new ArrayList<>();

        names.add("aa");
        names.add("bb");
        names.add("cc");

        System.out.println(names);

        names.remove("bb");

        System.out.println(names);
    }
}
