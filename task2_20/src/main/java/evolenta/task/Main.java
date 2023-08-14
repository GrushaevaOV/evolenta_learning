package evolenta.task;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 15) + 1;
        }
        for (int i : arr) System.out.print(i + " ");
        printDoubleNum(arr);
    }

    public static HashMap<Integer, Integer> doubleNum(int[] array) {
        HashMap<Integer, Integer> doubleNum = new HashMap<>();
        for (int j : array) {
            if (!doubleNum.containsKey(j)) {
                doubleNum.put(j, 1);
            } else {
                doubleNum.put(j, doubleNum.get(j) + 1);
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