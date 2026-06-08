class PrintOddRecursion {

    static void printOdd(int n) {

        if(n > 20) {
            return;
        }

        if(n % 2 != 0) {
            System.out.println(n);
        }

        printOdd(n + 1);
    }

    public static void main(String[] args) {

        printOdd(1);
    }
}