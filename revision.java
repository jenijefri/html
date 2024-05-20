import java.util.*;

public class revision {
    static Scanner list = new Scanner(System.in);
    static List<String> books = new ArrayList<>(); // List to store books

    public static void main(String[] args) throws Exception {
        int userType;
        books.add("jenitta");
        books.add("jeni");


       // books.remove(0);
    

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
                System.out.println("6.Exist");

                int adminType = list.nextInt();
            
                if (adminType == 1) {
            
                    System.out.println("Enter the name of the book to add:");
                    list.nextLine(); // Consume the newline character
                    String bookName = list.nextLine(); // Read the input from the user
                    System.out.println("You entered: " + bookName);
                    // Here you can add code to handle adding the book to the library
                 books.add(bookName);//add the book to the list
                 System.out.println("Book added successfully");
                }
                else if (adminType==2){
                System.out.println("List of books:");
                for (String book : books) {
                    System.out.println(book);
            
                }
            }
    
                else if(adminType == 4) {
                    System.out.println("Enter the book name to update:");
                    list.nextLine(); // Consume the newline character
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
                
            
            
            
             else if(adminType==5){
                System.out.println("Enter the name of the book to delete:");
                    list.nextLine(); // Consume the newline character
                    String bookName = list.nextLine(); // Read the input from the user
                    if (books.remove(bookName)) {
                        System.out.println("Book deleted successfully!");
                    } else {
                        System.out.println("Book not found!");
                    }
                } 
            }
            
            else if (userType == 2) {
                System.out.println("WELCOME, USER");
                System.out.println("1. Show Book");
                System.out.println("2. Allocate Book");
                System.out.println("Choose the option");

                int userChoice = list.nextInt();
                list.nextLine(); // Consume the newline character
                if(userChoice==1){
                    System.out.println("List of books");
                    for(String book : books){
                        System.out.println(book);
                    }                    

                
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
        System.out.println("exist the library");
    }
}





