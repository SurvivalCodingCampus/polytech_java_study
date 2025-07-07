package com.survivalcoding.assignments_01_instance.exam01.Instance;

import java.util.Date;

public class Book {
    private String title;
    private Date publishDate;
    private String comment;
}

// 제목과 출간일이(예: 2024-01-01) 같으면 같은 책으로 판단한다. 또한 List, Map, Set 등의 컬렉션에 넣어도 동일 객체로 판단한다.
// Book 인스턴스를 담고 있는 컬렉션에 대해 Collections.sort() 를 사용하면 출간일이 신상 순서대로 정렬된다
// clone() 메서드를 제공하고, 깊은 복사를 수행한다
