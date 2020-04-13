import java.util.Scanner;

public class LargestAndSmallest {
    public static void main(String[] args) {
        int min = Integer.MAX_VALUE;
        int input = -99;
        int max = Integer.MIN_VALUE;

        Scanner keyboard = new Scanner(System.in);

        do {
            if (input != -99 && input > max) {
                max = input;
            }

            if (input != -99 && input < min) {
                min = input;
            }
            System.out.print(" Enter an integer (-99 to stop):");
            input = keyboard.nextInt();
        } while (input != -99);
            System.out.println(" The smallest number was:" + min);
            System.out.println("The largest number was: " + max);

    }
}

