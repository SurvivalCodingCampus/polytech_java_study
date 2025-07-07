package instance;

import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Date;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Objects;

public class Book implements Comparable<Book>, Cloneable {
    private String title;
    private LocalDate publishDate;
    private String comment;

    public Book(String title, LocalDate publishDate, String comment) {
        this.title = title;
        this.publishDate = publishDate;
        this.comment = comment;
    }

    public Book() {
        this("기본", LocalDate.now(), "미등록 상태");
    }
    @Override
    public int compareTo(Book obj) {
        if (this.publishDate.isBefore((obj.publishDate))) {
            return -1;
        } else if (this.publishDate.isAfter((obj.publishDate))) {
            return 1;
        }
        return 0;
    }

    @Override
    public Book clone() {
        Book result = new Book();
        result.title = this.title;
        result.publishDate = LocalDate.of(this.publishDate.getYear(), this.publishDate.getMonth(),this.publishDate.getDayOfMonth());
        result.comment = this.comment;
        return result;
    }

    // equals
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book book)) return false;
        return title.equals(book.title) && this.publishDate.isEqual(book.getPublishDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, publishDate);
    }

    // getter
    public String getTitle() {
        return title;
    }

    public LocalDate getPublishDate() {
        return publishDate;
    }

    public String getComment() {
        return comment;
    }

    // setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
