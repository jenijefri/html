import java.util.*;

public class library {
    static Scanner list = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int userType;
        do {
            System.out.println("               WELCOME TO LIBRARY            ");
            System.out.println("WHICH USER YOU ARE?");
            System.out.println("1. Admin");
            System.out.println("2. User");
            System.out.println("3. Exit");
            System.out.println("Choose the option");

            userType = list.nextInt();
            System.out.println("Processing....");
            Thread.sleep(2000);

            if (userType == 1) {
                System.out.println("WELCOME ADMIN");
                System.out.println("1. Add Books ");
                System.out.println("2. Show Books");
                System.out.println("3. Allocate Book");
                System.out.println("4. Update Book Name");
                System.out.println("5. Delete Book");

                int adminType = list.nextInt();
                if (adminType == 1) {
                    System.out.println("Enter the name of the book to add:");
                    list.nextLine(); // Consume the newline character
                    String bookName = list.nextLine(); // Read the input from the user
                    System.out.println("You entered: " + bookName);
                    // Here you can add code to handle adding the book to the library
                }
            } else if (userType == 2) {
                System.out.println("WELCOME, USER");
                System.out.println("1. Show Book");
                System.out.println("2. Allocate Book");

                int userChoice = list.nextInt();
                list.nextLine(); // Consume the newline character
                if (userChoice == 1) {
                    System.out.println("Enter the book name:");
                    String bookName = list.nextLine(); // Read the input from the user
                    System.out.println("You entered: " + bookName);
                    // Here you can add code to handle displaying the book or any further processing
                } else if (userChoice == 2) {
                    System.out.println("Enter the book name:");
                    String bookName = list.nextLine(); // Read the input from the user
                    System.out.println("You entered: " + bookName);
                    // Here you can add code to handle allocating the book or any further processing
                } else {
                    System.out.println("Invalid option");
                }
            }
        } while (userType != 3);
    }
}
