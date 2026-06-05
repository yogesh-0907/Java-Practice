class ArraySumMethod {

    static int sum(int[] arr) {

        int total = 0;

        for(int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        return total;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30};

        System.out.println(sum(arr));
    }
}