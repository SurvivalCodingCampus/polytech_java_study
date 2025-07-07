package instance;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class BookSet {

    public static void main(String[] args) {
        Set<Book> bookList = new HashSet<>();
        Book b1 = new Book("aaa", new Date(2025, 1, 1, 1, 1));
        Book b2 = new Book("bbb", new Date(2025, 2, 1, 2, 2));

        bookList.add(b1);
        System.out.println(bookList.size());

        bookList.remove(b2);
        System.out.println(bookList.size());
    }
}
