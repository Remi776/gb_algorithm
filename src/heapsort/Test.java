package heapsort;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] array = {16, 7, 10, 1, 5, 11, 3, 8, 14, 4, 2, 12, 6, 13, 9, 15};
        HeapSort.sort(array);

        System.out.println(Arrays.toString(array));
    }
}
