package com.survivalcoding.assignments_01_instance.exam01;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void main(String[] args) {

        Person hongGilDong = new Person("홍길동", 20);
        Person hanSeokBong = new Person("한석봉", 25);

        Map<String, Integer> personAgeMap = new HashMap<>();
        personAgeMap.put(hongGilDong.getName(), hongGilDong.getAge());
        personAgeMap.put(hanSeokBong.getName(), hanSeokBong.getAge());


        for (Map.Entry<String, Integer> entry : personAgeMap.entrySet()) {
            System.out.println(entry.getKey() + "의 나이는 " + entry.getValue() + "살");
        }

        System.out.println();

        Map<String, Person> personMap = new HashMap<>();
        personMap.put(hongGilDong.getName(), hongGilDong);
        personMap.put(hanSeokBong.getName(), hanSeokBong);

        for (Map.Entry<String, Person> entry : personMap.entrySet()) {
            String name = entry.getKey();
            Person person = entry.getValue();
            System.out.println(name + "의 나이는 " + person.getAge() + "살");
        }

        personAgeMap.entrySet().stream().forEach(entry -> System.out.println(
                        entry.getKey() + "의 나이는 " + entry.getValue() + "살"));
    }
}