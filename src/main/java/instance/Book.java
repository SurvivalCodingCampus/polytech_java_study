package instance;

import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book>, Cloneable {
    private String title;
    private Date publishDate;
    private String comment;

    public Book(String title, Date publishDate) {
        this.title = title;
        this.publishDate = publishDate;
    }

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(publishDate, book.publishDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, publishDate);
    }

    @Override
    public int compareTo(Book o) {

        return 0;
    }

    @Override
    public Book clone() {

    }

    public static void main(String[] args) {

        Book book1 = new Book("aaa", new Date(2025, 1, 1));
        Book book2 = new Book("bbb", new Date(2025, 2, 1));


    }

}
