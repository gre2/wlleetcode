public class 快排 {

    //找第一个数作为基数，每次从后往前找到一个小于基数的，从前往后找到一个大于基数的互换位置，直到左右焦点重合，把基数给做焦点，之后递归左边和右边
    private static void QuickSort(int[] array, int start, int end) {
        int q;
        if (start < end) {
            q = getIndex(array, start, end);
            QuickSort(array, q + 1, end);
            QuickSort(array, start, q - 1);
        }

    }

    private static int getIndex(int[] array, int start, int end) {
        int key = array[start];
        while (start < end) {
            while (start < end && array[end] > key) {
                end--;
            }
            while (start < end && array[start] < key) {
                start++;
            }
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
        }
        array[start] = key;
        return start;
    }

    public static void main(String[] args) {
        int[] array = new int[]{6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
        QuickSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + "th:" + array[i]);
        }
    }
}
