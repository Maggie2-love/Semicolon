public static int factorOf(int number) {

    int count = 0;

    for (int divisor = 1; divisor <= number; divisor++) {

        if (number % divisor == 0) {
            count++;
        }
    }

    return count;
}
