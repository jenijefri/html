import java.util.*;

class java {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Prompting user to enter the table numbers
        System.out.println("Enter the table numbers:");
        String tableNumbersInput = sc.nextLine();
        String[] tableNumbersStr = tableNumbersInput.split(",");
        int[] tableNumbers = new int[tableNumbersStr.length];
        for (int i = 0; i < tableNumbersStr.length; i++) {
            tableNumbers[i] = Integer.parseInt(tableNumbersStr[i].trim());
        }

        // Prompting user to enter the table counts
        System.out.println("Enter the table counts (separated by commas):");
        String tableCountsInput = sc.nextLine();
        String[] tableCountsStr = tableCountsInput.split(",");
        int[] tableCounts = new int[tableCountsStr.length];
        for (int i = 0; i < tableCountsStr.length; i++) {
            tableCounts[i] = Integer.parseInt(tableCountsStr[i].trim());
        }

        // Displaying the multiplication tables
        for (int i = 0; i < tableNumbers.length; i++) {
            int tableNumber = tableNumbers[i];
            int tableCount = tableCounts[i];
            System.out.println("\nMultiplication table for table " + tableNumber + ":");
            for (int j = 1; j <= tableCount; j++) {
                System.out.println(tableNumber + " * " + j + " = " + (tableNumber * j));
            }
        }
    }
}
