import java.util.Scanner;

public class BeverageSelector {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Select a beverage from the choices 1,2, or 3");
        int beverage = input.nextInt();
        if (beverage == 1) {
            System.out.println("Beverage picked : Water ");
        } else if (beverage == 2) {
            System.out.println("Beverage picked : Coke ");

        } else {
            System.out.println("Beverage picked : Coffee ");

        }
    }
}

