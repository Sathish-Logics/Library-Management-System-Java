import java.util.*;

public class ReturnBooksAction implements LibraryAction {
    private final HashMap<String, String> books;
    private final BorrowBooksAction borrowAction;
    private final Scanner scanner = new Scanner(System.in);

    public ReturnBooksAction(HashMap<String, String> books, BorrowBooksAction borrowAction) {
        this.books = books;
        this.borrowAction = borrowAction;
    }

    @Override
    public void execute() {
        System.out.print("Enter Book Name to return: ");
        String bookName = scanner.nextLine();

        if (borrowAction.isBorrowed(bookName)) {
            borrowAction.returnBook(bookName);
            System.out.println("Returned: " + bookName + " by " + books.get(bookName));
        } else if (!books.containsKey(bookName)) {
            System.out.println("Book not found in library!");
        } else {
            System.out.println("This book wasn't borrowed!");
        }
    }
}