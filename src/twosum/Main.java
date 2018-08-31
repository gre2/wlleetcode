package twosum;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int nums[] = new int[]{2, 7, 11, 15};
        int target = 9;
        twoSum(nums, target);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer n = nums[i];
            Integer tar = target - n;
            if (map.get(tar) != null) {
                System.out.println("n=" + n + "---tar=" + tar);
                return new int[]{tar, n};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
