package com.survivalcoding.assignments_01_instance.exam01.ab;

//유형자산 (TangibleAsset)이 부모 클래스

public class Book extends TangibleAsset{
    public Book(){
        super();
    }

    public Book(String name, int price, String color, double weight, String isbn){
        super(name, price, color, weight);
        this.isbn=isbn;
    }

    private String isbn;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
