import java.util.Scanner;

public class ModifiedDiamond {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an odd number from 1 to 19: ");
        int rows = input.nextInt();

        
        while (rows < 1 || rows > 19 || rows % 2 == 0) {
            System.out.print("Invalid. Enter an odd number from 1 to 19: ");
            rows = input.nextInt();
        }

        int middle = (rows + 1) / 2;

        // Top half
        for (int row = 1; row <= middle; row++) {

            // Print spaces
            for (int space = 1; space <= middle - row; space++) {
                System.out.print(" ");
            }

            // Print stars
            for (int star = 1; star <= 2 * row - 1; star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Bottom half
        for (int row = middle - 1; row >= 1; row--) {

            // Print spaces
            for (int space = 1; space <= middle - row; space++) {
                System.out.print(" ");
            }

            // Print stars
            for (int star = 1; star <= 2 * row - 1; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
