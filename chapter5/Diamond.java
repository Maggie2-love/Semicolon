public class Diamond {
    public static void main(String[] args) {

        // Top half
        for (int row = 1; row <= 5; row++) {

            // Print spaces
            for (int space = 5; space > row; space--) {
                System.out.print(" ");
            }

            // Print stars
            for (int star = 1; star <= (2 * row - 1); star++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Bottom half
        for (int row = 4; row >= 1; row--) {

            // Print spaces
            for (int space = 5; space > row; space--) {
                System.out.print(" ");
            }

            // Print stars
            for (int star = 1; star <= (2 * row - 1); star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
