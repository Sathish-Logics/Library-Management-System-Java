import java.util.*;

public class ListBooksAction implements LibraryAction {
    private final HashMap<String, String> books;
    private final BorrowBooksAction borrowAction;

    public ListBooksAction(HashMap<String, String> books, BorrowBooksAction borrowAction) {
        this.books = books;
        this.borrowAction = borrowAction;
    }

    @Override
    public void execute() {
        System.out.println("\nAvailable Books:");
        books.forEach((name, author) -> {
            if (!borrowAction.isBorrowed(name)) {
                System.out.println(name + " by " + author);
            }
        });
    }
}