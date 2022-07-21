import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

/*
 *  Problems:
 *  // This is impossible to do without changing Book class which we are not allowed to do
 *  - print the book name along with its title if the book is present in the HashMap. 
 * 
 *   x Print the book’s
 *   name and its author (separated by `written by`) if the author is present and the
 *  “Unknown” string otherwise.
 */
public class Main {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // String bookName = scanner.nextLine();
        String bookName = "";
        Optional<String> optAuthor = Book.getAuthor(bookName);
        optAuthor.ifPresentOrElse(author -> System.out.println(bookName + " written by " + author),
                () -> System.out.println("“Unknown”"));

        // write your code here
    }
}

// DO NOT MODIFY the code below //
class Book {
    private static final Map<String, String> books = new HashMap<>();

    static {
        books.put("Effective Java", "Joshua Bloch");
        books.put("Designing Data-Intensive Applications", "Martin Kleppmann");
        books.put("Modern Java in Action", "Raoul-Gabriel Urma");
    }

    static Optional<String> getAuthor(String name) {
        return Optional.ofNullable(books.get(name));
    }
}
