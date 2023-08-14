package evolenta.task;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 15) + 1;
        }
        String intAString = Arrays.toString(arr);
        System.out.println(intAString);
    }
}