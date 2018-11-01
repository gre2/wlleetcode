import java.util.Arrays;

public class 排列两个数组 {
    public static void main(String[] args) {
        int one[] = {1, 3, 5, 7};
        int two[] = {2, 4, 6, 8, 9};
        int three[] = new int[9];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < one.length && j < two.length) {
            if (one[i] <= two[j]) {
                three[k] = one[i];
                i++;
            } else {
                three[k] = two[j];
                j++;
            }
            k++;
        }
        System.out.println(Arrays.asList(three));

    }
}
