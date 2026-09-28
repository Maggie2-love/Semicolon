import java.util.Scanner;

public class NumberOneToN {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = input.nextInt();

        for (int number = 1; number <= n; number++) {
            System.out.println(number);
        }
    }
}
