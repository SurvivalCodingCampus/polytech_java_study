package com.survivalcoding.assignments_01_instance.exam01;

public class Book extends TangibleAsset {

   public Book(String name, int price, String color){
       super(name, price, color);
   }

    private String isbn;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
