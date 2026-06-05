class MaximumMethod {

    static int max(int a, int b) {

        if(a > b) {
            return a;
        }

        return b;
    }

    public static void main(String[] args) {

        System.out.println(max(10, 25));
    }
}