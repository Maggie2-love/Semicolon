public static boolean isPrimeNumber(int number) {

    if (number < 2) {
        return false;
    }

    for (int count = 2; count < number; count++) {

        if (number % count == 0) {
            return false;
        }
    }

    return true;
}
