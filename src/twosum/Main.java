package twosum;

import com.sun.jmx.snmp.internal.SnmpSubSystem;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int nums[] = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] ints = twoSum1(nums, target);
        System.out.println(ints[0]+"=="+ints[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer first = nums[i];
            Integer second = target - first;
            if (map.get(second) != null) {
                System.out.println("n=" + first + "---tar=" + second);
                return new int[]{second, first};
            }
            map.put(first, i);
        }
        return null;
    }
    public static int[] twoSum1(int[] nums, int target) {
       Map<Integer,Integer> map=new HashMap<>();//值，位数
       for(int i=0;i<nums.length-1;i++){
           int first = nums[i];
           int second = target - first;
           if(map.get(second)!=null){
               return new int[]{first,second};
           }
           map.put(first,i);
       }
       return null;
    }
}
