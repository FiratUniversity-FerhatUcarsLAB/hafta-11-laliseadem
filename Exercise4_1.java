import java.util.Scanner;

public class Exercise4_1 {

    public static void printAmerican(String day, int date, String month, int year) {
        // Örnek: Monday, July 22, 2019
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    public static void printEuropean(String day, int date, String month, int year) {
        // Örnek: 22 July 2019, Monday
        System.out.println(date + " " + month + " " + year + ", " + day);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter day (e.g. Monday): ");
        String day = input.nextLine();

        System.out.print("Enter month (e.g. July): ");
        String month = input.nextLine();

        System.out.print("Enter date (e.g. 22): ");
        int date = input.nextInt();

        System.out.print("Enter year (e.g. 2019): ");
        int year = input.nextInt();

        System.out.println("\nAmerican Format:");
        printAmerican(day, date, month, year);

        System.out.println("European Format:");
        printEuropean(day, date, month, year);
    }
}
