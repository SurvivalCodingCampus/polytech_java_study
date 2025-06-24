package com.survivalcoding.assignments_01_instance.exam01;

public class Book extends TangibleAsset {

   public Book(String name, int price, String color, double weight){
       super(name, price, color, weight);
   }

    private String isbn;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
