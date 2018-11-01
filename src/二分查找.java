public class 二分查找 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5, 6, 7, 8, 9};
        int num = getIndex(arr, 3);
        System.out.println("11111111111");
        int[] brr = {1, 2, 2, 2, 3, 4, 5, 6, 7, 8, 9};
        int s = getFirst(0, brr.length - 1, brr, 2);
        System.out.println(s);
        int[] crr = {1, 2, 2, 2, 3, 4, 5, 6, 7, 8, 9};
        int ss = getLast(0, crr.length - 1, crr, 2);
        System.out.println(ss);
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


    public static int getFirst(int L, int R, int[] a, int t) {
        //第一个等于，应当向右收敛
        int l = L, r = R, m;
        while (l <= r) {
            m = l + (r - l) / 2;
            if (a[m] < t) l = m + 1;    //未达到FLAG,区间向右收敛
            else r = m - 1;     //触发FLAG,怂，退回来
        }
        return (l > R && a[l] == t) ? -1 : l; //向右收敛都要考虑上溢
        //还要考虑：虽然没有出界，但可能根本不存在此数t
    }

    public static int getLast(int L, int R, int[] a, int t) {
        //第一个等于，应当向右收敛
        int l = L, r = R, m;
        while (l <= r) {
            m = l + (r - l) / 2;
            if (a[m] > t) r = m - 1;    //未达到FLAG,区间向左收敛
            else l = m + 1;  //触发FLAG,怂，退回来
        }
        return (r < L && a[r] == t) ? -1 : r;//向左收敛都要考虑上溢
        //还要考虑：虽然没有出界，但可能根本不存在此数t
    }

    // 查找第一个t，FLAG使用大于等于，方向向右，返回l，考虑l上溢，还要专门考虑此数存不存在。
    //查找最后一个t，FLAG使用小于等于，方向向左，返回r，考虑r下溢，还要专门考虑此数存不存在。


}
