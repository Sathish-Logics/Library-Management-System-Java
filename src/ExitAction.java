public class ExitAction implements LibraryAction {
    @Override
    public void execute() {
        System.out.println("Exiting...");
        System.out.println("Good Bye!");
        System.exit(0);
    }
}
