public class 冒泡 {

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 54, 5, 7, 67, 45, 453};
        int[] brr = sortArray(arr);
        System.out.println("11111111");
    }

    private static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
