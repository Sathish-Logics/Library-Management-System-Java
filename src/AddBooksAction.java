import java.util.*;

public class AddBooksAction implements LibraryAction {

    private HashMap<String, String> books;
    Scanner scanner = new Scanner(System.in);

    public AddBooksAction(HashMap<String, String> books) {
        this.books = books;
    }

    @Override
    public void execute() {

        System.out.print("Enter Book Name: ");
        String bookName = scanner.nextLine();

        System.out.print("Enter Author Name: ");
        String bookAuthor = scanner.nextLine();

        books.put(bookName, bookAuthor);
        System.out.println("Book added successfully!");
    }

}
