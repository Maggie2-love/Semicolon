public static boolean isPerfectSquare(int number) {

    if (number < 0) {
        return false;
    }

    int squareRoot = (int) Math.sqrt(number);

    return squareRoot * squareRoot == number;
}
