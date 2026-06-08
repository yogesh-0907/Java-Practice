class PrintEvenRecursion {

    static void printEven(int n) {

        if(n > 20) {
            return;
        }

        if(n % 2 == 0) {
            System.out.println(n);
        }

        printEven(n + 1);
    }

    public static void main(String[] args) {

        printEven(1);
    }
}