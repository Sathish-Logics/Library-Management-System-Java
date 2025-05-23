import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> books = new HashMap<>();

        books.put("The Hobbit", "J.R.R. Tolkien");
        books.put("Harry Potter", "J.K. Rowling");
        books.put("1984", "George Orwell");

        AddBooksAction addAction = new AddBooksAction(books);
        BorrowBooksAction borrowAction = new BorrowBooksAction(books);
        ListBooksAction listAction = new ListBooksAction(books, borrowAction);
        ReturnBooksAction returnAction = new ReturnBooksAction(books, borrowAction);
        ExitAction exitAction = new ExitAction();

        while (true) {
            System.out.println();
            System.out.println("\n1. Add Book\n2. List Books\n3. Borrow Book\n4. Return Book\n5. Exit");
            System.out.print("Choose Option: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> addAction.execute();
                case 2 -> listAction.execute();
                case 3 -> borrowAction.execute();
                case 4 -> returnAction.execute();
                case 5 -> exitAction.execute();
                default -> System.out.println("Invalid Option");
            }
        }
    }
}