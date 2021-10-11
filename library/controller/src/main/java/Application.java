import java.util.ArrayList;
import java.util.Scanner;
import com.google.gson.*;

public class Application {
    private static final Library library = LibraryFactory.createLibrary();
    private static final GsonBuilder gsonBuilder = new GsonBuilder();
    private static final Gson gson = gsonBuilder.create();

    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Передайте первым параметром имя, вторым параметром фамилию.");
            return;
        }

        Author author = askAboutAuthor(args);
        ArrayList<Book> books = library.searchBooksByAuthor(author);
        printInfo(books);
    }

    private static void printInfo(ArrayList<Book> books) {

        if (books.size() == 0) {
            System.out.println("Нет такого автора.");
            return;
        }
        books.forEach(book -> System.out.println(gson.toJson(book)));
    }

    private static Author askAboutAuthor(String[] args) {

        String name = args[0];
        String surname = args[1];

        return new Author(name, surname);
    }
}
