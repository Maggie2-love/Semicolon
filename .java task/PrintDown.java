import java.util.Scanner;

public class PrintNDownToOne {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        for (int number = n; number >= 1; number--) {
            System.out.println(number);
        }
    }
}
