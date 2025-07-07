package instance;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Date;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Objects;

public class Book implements Comparable<Book>, Cloneable {
    private String title;
    private Date publishDate;
    private String comment;

    public Book(String title, Date publishDate, String comment) {
        this.title = title;
        this.publishDate = publishDate;
        this.comment = comment;
    }

    public Book() {
        this("기본", new Date(), "미등록 상태");
    }
    @Override
    public int compareTo(Book obj) {
        if (this.publishDate.before((obj.publishDate))) {
            return 1;
        } else if (this.publishDate.after((obj.publishDate))) {
            return -1;
        }
        return 0;
    }

    @Override
    public Book clone() {
        Book result = new Book();
        result.title = this.title;
        result.publishDate = new Date(this.publishDate.getTime());
        result.comment = this.comment;
        return result;
    }

    // equals
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book book)) return false;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String formatDate = format.format(this.publishDate);
        String formatDateOther = format.format(book.getPublishDate());
        return title.equals(book.title) && formatDate.equals(formatDateOther);
    }

    @Override
    public int hashCode() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String formatDate = format.format(this.publishDate);

        return Objects.hash(title, formatDate);
    }

    // getter
    public String getTitle() {
        return title;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public String getComment() {
        return comment;
    }

    // setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
