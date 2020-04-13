import javax.swing.*;
import java.util.Scanner;

public class TheSpeedOfSound {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String medium;
        String input;
        double distance = 0;
        double time = 0;

        System.out.print("Enter one of the following: air, water, or steel: ");
        medium = sc.nextLine();

        if (medium.equalsIgnoreCase("air") || medium.equalsIgnoreCase("water") || medium.equalsIgnoreCase("steel")) {
            System.out.print("Enter the distance the sound wave will travel: ");
            distance = sc.nextDouble();
            if (medium.equalsIgnoreCase("air")) {
                time = distance / 1100;
            } else if (medium.equalsIgnoreCase("water")) {
                time = distance / 4900;
            } else if (medium.equalsIgnoreCase("steel")) {
                time = distance / 16400;
            }
            System.out.println(" It will take " + time + " seconds.");
        } else {
            System.out.println("Sorry, you must enter air, water, or steel.");
        }
    }
}



