package com.survivalcoding.Instance;


import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book>, Cloneable {
    private String title;
    private Date publishDate;
    private String comment;

    // 생성자
    public Book(String title, Date publishDate, String comment) {
        this.title = title;
        this.publishDate = publishDate;
        this.comment = comment;
    }

    // Getter/Setter 메서드
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    // 문제 1 : 제목과 출간 일이 같으면 같은 책으로 판단
    @Override
    public boolean equals(Object obj) { // 두 Book 객체가 같은지 판단 > Object 클래스의 equals 메서드를 재정의한다는 의미
        if (this == obj) return true; // 자신과 같으면 true
        if (obj == null || getClass() != obj.getClass()) return false; // null 이거나 다른 클래스면 false
        Book book = (Book) obj; // Object를 Book으로 형변환
        return Objects.equals(title, book.title) && Objects.equals(publishDate.getYear(), book.publishDate.getYear()) && Objects.equals(publishDate.getMonth(), book.publishDate.getMonth()) && Objects.equals(publishDate.getDate(), book.publishDate.getDate());
        // 제목과 출간일이 모두 같으면 같은 책으로 판단
        // Object.equals()는 null 값도 안전하게 비교해준다 함
    }

    @Override
    public int hashCode() { // 객체를 빠르게 찾기 위한 해시값 생성
        return title.hashCode() + publishDate.getYear() + publishDate.getMonth() + publishDate.getDate();
    }

    // 문제 2 : 출간일이 신상 순서대로 정렬되도록 한다.
    @Override
    public int compareTo(Book other) {   // compareTo 메서드
        return other.publishDate.compareTo(this.publishDate); // 다른 객체가 먼저 vs 현재 객체 나중에 나옴  > 큰 것 부터
    }

    // 문제 3 : clone 메서드를 이용하여 깊은 복사 수행하기
    @Override
    public Book clone() {

        Book book = new Book(title, publishDate, comment);

        book.setPublishDate(new Date(book.getPublishDate().getYear(), book.getPublishDate().getMonth(), book.getPublishDate().getDate()));

        return book;

    }
}
