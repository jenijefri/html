import java.util.*;

public class method {
    static Scanner list = new Scanner(System.in);
    static List<String> books = new ArrayList<>(); // List to store books

    public static void main(String[] args) throws Exception {
        books.add("jenitta");
        books.add("jeni");

        displayWelcomeMessage();

        int userType;
        do {
            System.out.println("Choose the option");
            userType = list.nextInt();
            System.out.println("Processing....");
            Thread.sleep(2000);
            handleUserType(userType);
        } while (userType != 3);

        System.out.println("Exiting the library");
    }

    static void displayWelcomeMessage() {
        System.out.println("               WELCOME TO LIBRARY            ");
        System.out.println("WHICH USER YOU ARE?");
        System.out.println("1. Admin");
        System.out.println("2. User");
        System.out.println("3. Exit");
    }

    static void handleUserType(int userType) {
        switch (userType) {
            case 1:
                handleAdmin();
                break;
            case 2:
                handleUser();
                break;
            case 3:
                break;
            default:
                System.out.println("Invalid option");
        }
    }

    static void handleAdmin() {
        System.out.println("WELCOME ADMIN");
        System.out.println("1. Add Books ");
        System.out.println("2. Show Books");
        System.out.println("3. Allocate Book");
        System.out.println("4. Update Book Name");
        System.out.println("5. Delete Book");
        System.out.println("6. Exit");

        int adminType = list.nextInt();
        list.nextLine(); // Consume the newline character
        switch (adminType) {
            case 1:
                addBook();
                break;
            case 2:
                showBooks();
                break;
            case 4:
                updateBookName();
                break;
            case 5:
                deleteBook();
                break;
            case 6:
                break;
            default:
                System.out.println("Invalid option");
        }
    }

    static void addBook() {
        System.out.println("Enter the name of the book to add:");
        String bookName = list.nextLine().trim();
        books.add(bookName);
        System.out.println("Book added successfully");
    }

    static void showBooks() {
        System.out.println("List of books:");
        for (String book : books) {
            System.out.println(book);
        }
    }

    static void updateBookName() {
        System.out.println("Enter the book name to update:");
        String updateBook = list.nextLine().trim();

        int index = books.indexOf(updateBook);
        if (index != -1) {
            System.out.println("Enter the new book name:");
            String newBookName = list.nextLine().trim();
            books.set(index, newBookName);
            System.out.println("Book updated successfully.");
        } else {
            System.out.println("Book not found in the list.");
        }
    }

    static void deleteBook() {
        System.out.println("Enter the name of the book to delete:");
        String bookName = list.nextLine().trim();
        if (books.remove(bookName)) {
            System.out.println("Book deleted successfully!");
        } else {
            System.out.println("Book not found!");
        }
    }

    static void handleUser() {
        System.out.println("WELCOME, USER");
        System.out.println("1. Show Book");
        System.out.println("2. Allocate Book");

        int userChoice = list.nextInt();
        list.nextLine(); // Consume the newline character
        switch (userChoice) {
            case 1:
                showBooks();
                break;
            case 2:
                allocateBook();
                break;
            default:
                System.out.println("Invalid option");
        }
    }

    static void allocateBook() {
        System.out.println("Enter the book name:");
        String bookName = list.nextLine();
        System.out.println("You entered: " + bookName);
        // Further processing for allocating the book can be added here
    }
}
