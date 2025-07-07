package instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class BookList {

    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();
        Book b1 = new Book("aaa", new Date(2025, 1, 1, 1, 1));
        Book b2 = new Book("aaa", new Date(2025, 1, 1, 2, 2));

        bookList.add(b1);
        System.out.println(bookList.size()); //1

        bookList.remove(b2);
        System.out.println(bookList.size()); //0

        Collections.sort();

    }

}
