class BinarySearchRecursion {

    static int binarySearch(int[] arr, int target, int start, int end) {

        if(start > end) {
            return -1;
        }

        int mid = (start + end) / 2;

        if(arr[mid] == target) {
            return mid;
        }

        if(target < arr[mid]) {
            return binarySearch(arr, target, start, mid - 1);
        }

        return binarySearch(arr, target, mid + 1, end);
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println(
            binarySearch(arr, 30, 0, arr.length - 1)
        );
    }
}