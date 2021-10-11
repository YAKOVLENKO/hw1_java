import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Library {
    private HashMap<Author, ArrayList<Book>> books = new HashMap<>();

    public Library(List<Book> books) {
        books.forEach(this::addBook);
    }

    public void addBook(Book book) {
        Author author = book.getAuthor();
        if (this.books.containsKey(author)) {
            ArrayList<Book> authorBooks = this.books.get(author);
            authorBooks.add(book);
        }
        else {
            ArrayList<Book> authorBooks = new ArrayList<Book>() {{ add(book); }};
            this.books.put(author, authorBooks);
        }
    }

    private String arrayListToGson(ArrayList<Book> books) {
        return "";
    }

    public ArrayList<Book> searchBooksByAuthor(Author author) {
        if (this.books.containsKey(author))
        {
            return books.get(author);
        }
        else return new ArrayList<>();
    }
}
