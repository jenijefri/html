import java.util.*;

public class Room {
    static Scanner person = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int button;
        do {
            System.out.println("Do you want to enter the room");
            System.out.println("1. Parent ");
            System.out.println("2. Grand Parent");
            System.out.println("3. Kids");
            System.out.println("4. Exit");
            System.out.println("Enter the option");
            button = person.nextInt();
            System.out.println("Processing.....");
            Thread.sleep(2000);
            if (button == 1)
                System.out.println("Allow the room for Parent");
            else if (button == 2)
                System.out.println("Allow the Room for Grand Parent");
            else if (button == 3) {
                System.out.println("Enter the Age");
                int age = person.nextInt();
                if (age >= 5)
                    System.out.println("Allow the room for kids");
                else
                    System.out.println("Do not allow the room for kids");
            } else if (button == 4)
                System.out.println("Exiting...");
            else
                System.out.println("Invalid option");
        } while (button != 4);
    }
}
