import java.util.Scanner;

public class Runners {
    public static void main(String[] args) {

        String input;
        String runnerOne;
        String runnerTwo;
        String runnerThree;
        double timeOne;
        double timeTwo;
        double timeThree;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter runner 1 name:");
        runnerOne = keyboard.nextLine();

        System.out.print(" Enter runner 1 time (in minutes):");
        timeOne = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.print(" Enter runner 2 name:");
        runnerTwo = keyboard.nextLine();

        System.out.print(" Enter runner 2 time (in minutes):");
        timeTwo = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.print(" Enter runner 3 name:");
        runnerThree = keyboard.nextLine();
        System.out.print(" Enter runner 3 time (in minutes):");
        timeThree = keyboard.nextDouble();
        keyboard.close();
        System.out.print(" ");
        if (timeOne <= timeTwo) {
            if (timeOne <= timeThree)
                if (timeTwo <= timeThree)
                    System.out.println(runnerOne + "\n" + runnerTwo + "\n" + runnerThree);
                else
                    System.out.println(runnerOne + "\n" + runnerThree + "\n" + runnerTwo);
            else
                System.out.println(runnerThree + "\n" + runnerOne + "\n" + runnerTwo);
        } else {
            if (timeTwo <= timeThree)
                if (timeOne <= timeThree)
                    System.out.println(runnerTwo + "\n" + runnerOne + "\n" + runnerThree);
                else
                    System.out.println(runnerTwo + "\n" + runnerThree + "\n" + runnerOne);
            else
                System.out.println(runnerThree + "\n" + runnerTwo + "\n" + runnerOne);
        }

    }
}