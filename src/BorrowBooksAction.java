import java.util.*;

public class BorrowBooksAction implements LibraryAction {
    private final HashMap<String, String> books;
    private final HashSet<String> borrowedBooks = new HashSet<>();
    private final Scanner scanner = new Scanner(System.in);

    public BorrowBooksAction(HashMap<String, String> books) {
        this.books = books;
    }

    @Override
    public void execute() {
        System.out.print("Enter Book Name to borrow: ");
        String bookName = scanner.nextLine();

        if (borrowedBooks.contains(bookName)) {
            System.out.println("Book is already borrowed!");
        } else if (books.containsKey(bookName)) {
            borrowedBooks.add(bookName);
            System.out.println("Borrowed: " + bookName + " by " + books.get(bookName));
        } else {
            System.out.println("Book not found!");
        }
    }

    public boolean isBorrowed(String bookName) {
        return borrowedBooks.contains(bookName);
    }

    public void returnBook(String bookName) {
        borrowedBooks.remove(bookName);
    }
}