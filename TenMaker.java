import java.util.Scanner;

public class TenMaker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number 1: ");
        int num1 = input.nextInt();
        System.out.println("Please enter number 2: ");
        int num2 = input.nextInt();
        boolean answer = makes10(num1, num2);
        if (answer) {
            System.out.println("These 2 numbers add up to 10.");
        } else {
            System.out.println("These 2 numbers do not add up to 10.");
        }
    }

    public static boolean makes10(int num1, int num2) {
        if (num1 + num2 == 10) {
            return true;
        } else
            return false;
    }
}

