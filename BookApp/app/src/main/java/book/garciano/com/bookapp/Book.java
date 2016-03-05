package book.garciano.com.bookapp;

/**
 * Created by admin on 3/5/2016.
 */
public class Book {
    private String title;
    private String genre;
    private String author;
    private Boolean isRead;

    public Book(String title, String genre, String author, Boolean isRead) {
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.isRead = isRead;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Boolean getIsRead() {
        return isRead;
    }

    public void setIsRead(Boolean isRead) {
        this.isRead = isRead;
    }
}
