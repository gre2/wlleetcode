public class 二分查找 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int num = getIndex(arr, 3);
        System.out.println("11111111111");
    }

    private static int getIndex(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        if (arr[0] > target || arr[arr.length - 1] < target) {
            return -1;
        }
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (target > arr[mid]) {
                left = mid + 1;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
