//import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LibraryFactory {
    public static final String PATH = "data.csv";
    public static Library createLibrary() {
        List<Book> books = generateBooks();
        Library library = new Library(books);
        System.out.println("helo");
        return new Library(books);
    }


    private static List<Book> generateBooks() {
        ArrayList<Author> authors = new ArrayList<Author>() {{
            add(new Author("Алексей", "Северов"));
            add(new Author("Ульяна", "Жукова"));
            add(new Author("Кирилл", "Кощеев"));
        }};

        ArrayList<Book> books = new ArrayList<Book>();
        books.add(new Book("1234", "Вешалка", authors.get(0), 1999));
        books.add(new Book("1235", "Ведро", authors.get(1), 1998));
        books.add(new Book("1236", "Огонь", authors.get(2), 1999));
        books.add(new Book("1237", "Фонарь", authors.get(2), 1995));
        books.add(new Book("1238", "Аптека", authors.get(0), 1996));
        return books;
    }

//    private static List<Book> readFromCSV() {
//        List<Book> beans = null;
//        try (FileReader fileReader = new FileReader(PATH)) {
//            beans = new CsvToBeanBuilder<Book>(fileReader)
//                    .withType(Book.class).build().parse();
//            return beans;
//        } catch (IOException e) {
//            System.out.println("Smt Wrong");
//            beans = new ArrayList<>();
//            System.out.println(e.getStackTrace());
//            return beans;
//        }
//    }
}
