package com.survivalcoding.assignments_01_instance.exam01.list;

import java.util.ArrayList;

public class ListMain {
    public static void main(String[] args) {
        final ArrayList<String> names = new ArrayList<>();

        //추가
        names.add("aa");
        names.add("bb");
        names.add("cc");

        System.out.println(names);

        //제거
        names.remove("bb"); //오버로드
        System.out.println(names);
    }
}
