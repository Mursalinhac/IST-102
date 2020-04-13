import java.text.NumberFormat;
import java.util.Scanner;

public class Population {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int days;
        double organisms = 0;
        double increaseRate = 0;

        System.out.print("Enter the starting number organisms: ");
        organisms = input.nextDouble();

        while (organisms < 2) {
            System.out.print("Invalid. Must be at least 2. Re-enter: ");
            organisms = input.nextDouble();
        }

        System.out.print("Enter the daily increase: ");
        increaseRate = input.nextDouble() / 100;

        while (increaseRate < 0) {
            System.out.print("Invalid. Enter a non-negative number: ");
            increaseRate = input.nextDouble();
        }

        System.out.print("Enter the number of days the organisms will multiply: ");
        System.out.print("Day\t\tOrganisms");
        days = input.nextInt();

        while (days < 1) {
            System.out.print("Invalid. Enter 1 or more: ");
            days = input.nextInt();
        }
        System.out.println("-----------------------------");
        System.out.println("1\t" + organisms);
        for (int i = 2; i < days + 1; i++) {
            organisms = organisms + (organisms * increaseRate);
            System.out.println(i + "\t" + organisms);
        }
        System.exit(0);
        input.close();
    }
}