import java.util.Scanner;

public class DistanceTravelled {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int time = 0, speed = -1 , distance;

        while (speed < 0) {
            System.out.print("Enter vehicle speed (in mph):");
            speed = sc.nextInt();
        }

        while (time < 1) {
            System.out.print(" Enter time travelled (in hrs):");
            time = sc.nextInt();
        }
        System.out.println(" Hour\tDistance Travelled");
        System.out.println("--------------------------");
        for (int hour = 1; hour <= time; hour++) {
                distance = hour * speed;
                System.out.println(hour +"\t\t\t\t"+ distance);
            }
        }
    }
