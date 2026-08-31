import java.time.LocalDate;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {
        //Задача 1
        Author author1 = new Author("Лев", "Толстой");
        Book book1 = new Book("Война и мир", 1865, author1);
        Author author2 = new Author("Антон", "Чехов");
        Book book2 = new Book("Вишнёвый сад", 1904, author2);
        System.out.println(author1.getName() + " " + author1.getSurname() + " " + book1.getTitle() + " " + book1.getYearPublication());
        System.out.println(author2.getName() + " " + author2.getSurname() + " " + book2.getTitle() + " " + book2.getYearPublication());
        book1.setYearPublication(1866);
        System.out.println(book1.getYearPublication());

    }
}