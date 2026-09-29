import java.util.Scanner;

public class Extreme {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many integers do you want to enter? ");
        int amount = input.nextInt();

        System.out.print("Enter integer 1: ");
        int number = input.nextInt();

        int minimum = number;
        int maximum = number;

        for (int i = 2; i <= amount; i++) {
            System.out.print("Enter integer " + i + ": ");
            number = input.nextInt();

            if (number < minimum) {
                minimum = number;
            }

            if (number > maximum) {
                maximum = number;
            }
        }

        int sum = minimum + maximum;

        System.out.println("Minimum = " + minimum);
        System.out.println("Maximum = " + maximum);
        System.out.println("Sum of extremes = " + sum);
    }
}
