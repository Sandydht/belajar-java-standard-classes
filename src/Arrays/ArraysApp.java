package Arrays;

import java.util.Arrays;

public class ArraysApp {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 24, 10};

        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.binarySearch(numbers, 4));
        System.out.println(Arrays.binarySearch(numbers, 100));

        int[] result = Arrays.copyOf(numbers, 2);
        System.out.println(Arrays.toString(result));
    }
}
