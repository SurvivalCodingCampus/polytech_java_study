package com.survivalcoding.assignments_01_instance.exam01;

public class StrongBox<E> {
    private E date;
    private KeyType keytype;
    private int usageCount = 0;

    public StrongBox(KeyType keytype) {
        this.keytype = keytype;
    }

    public void put(E date) {
        this.date = date;
    }

    public E get() {

        usageCount++;

        if(usageCount == 1024 && keytype == KeyType.PADLOCK){
            System.out.println("PADLOCk Open");
            return date;
        }
        else if(usageCount == 10000 && keytype == KeyType.BUTTON){
            System.out.println("BYTTON Open");
            return  date;
        }
        else if(usageCount == 30000 && keytype == KeyType.DIAL){
            System.out.println("DIAL Open");
            return date;
        }
        else if (usageCount == 1000000 && keytype == KeyType.FINGER) {
            System.out.println("FINGER Open");
            return date;
        }
        return null;
    }

}
