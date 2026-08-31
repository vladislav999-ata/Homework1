public class Book {
    private String title;
    private int yearPublication;
    private Author author;

    public Book(String title, int yearPublication, Author author) {
        this.title = title;
        this.yearPublication = yearPublication;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYearPublication() {
        return this.yearPublication;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
}


