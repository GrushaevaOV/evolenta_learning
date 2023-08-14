package evolenta.task;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[20];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 15) + 1;
        }
        for (int i : nums) System.out.print(i + " ");
        printDoubleNum(nums);
    }

    public static HashMap<Integer, Integer> doubleNum(int[] array) {
        HashMap<Integer, Integer> doubleNum = new HashMap<>();
        for (int i : array) {
            if (!doubleNum.containsKey(i)) {
                doubleNum.put(i, 1);
            } else {
                doubleNum.put(i, doubleNum.get(i) + 1);
            }
        }
        return doubleNum;
    }

    public static void printDoubleNum(int[] array) {
        HashMap<Integer, Integer> doubleNum = new HashMap<>(doubleNum(array));
        System.out.println();
        for (Map.Entry<Integer, Integer> entryMap : doubleNum.entrySet()) {
            if (entryMap.getValue() > 1) {
                System.out.println("число " + entryMap.getKey() + " встречается " + entryMap.getValue() + " раза");
            }
        }
    }
}