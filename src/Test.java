import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        int land = 0;
        int air = 0;
        int water = 0;
        String word = "";
        while (!(word.equals("xxxxx"))) {
            word = stdin.next();
            if (word.equals("land")) {
                land++;
            } else if (word.equals("air")) {
                air++;
            } else if (word.equals("water")) {
                water++;
            }
        }
        System.out.println("land:" + land);
        System.out.println("air:" + air);
        System.out.println("water:" + water);
    }
}