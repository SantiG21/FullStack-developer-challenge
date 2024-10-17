package CodeChallengeTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int S = 1; // Valor de S
        int[] inputArray1 = {1, 2, 3, 5, 6, 8, 9};
        int[] inputArray2 = {-2, -1};
        int[] inputArray3 = {-6, -5, 0, 5, 6};
        int[] inputArray4 = {-10, 10};
        
        System.out.println("Salida 1: " + Arrays.toString(squareAndFilter(inputArray1, S)));
        System.out.println("Salida 2: " + Arrays.toString(squareAndFilter(inputArray2, S)));
        System.out.println("Salida 3: " + Arrays.toString(squareAndFilter(inputArray3, S)));
        System.out.println("Salida 4: " + Arrays.toString(squareAndFilter(inputArray4, S)));
    }

    public static int[] squareAndFilter(int[] nums, int S) {
        int rangeLimit = S * S;
        List<Integer> squaredList = new ArrayList<>();
        
        for (int num : nums) {
            int squared = num * num;
            if (squared >= 0 && squared <= rangeLimit) {
                squaredList.add(squared);
            }
        }
        
        int[] resultArray = squaredList.stream().mapToInt(i -> i).toArray();
        Arrays.sort(resultArray);
        
        return resultArray;
    }
}
