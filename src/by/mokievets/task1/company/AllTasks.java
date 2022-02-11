package by.mokievets.task1.company;

import java.util.ArrayList;
import java.util.Arrays;

public class AllTasks {
    public static ArrayList<Double> doTaskThree(Double a, Double b) {
        Double c = Math.pow(a * a + b * b, 0.5);
        ArrayList<Double> parameters = new ArrayList<>();
        parameters.add(a + b + c);
        parameters.add(0.5 * a * b);
        return parameters;
    }
    public static boolean doTaskFour(double x, double y) {
        return ((x >= - 2) && (x <= 2) && (y >= 0) && (y <= 4))
                || ((x >= -4) && (x <= 4) && (y <= 0) && (y >= -3));
    }

    public static int[] doTaskNine(int[] nums1, int[] nums2, int k) {
        int[] all_nums = new int[nums1.length + nums2.length];
        Arrays.fill(all_nums, 0);
        System.arraycopy(nums1, 0, all_nums, 0, k);
        System.arraycopy(nums2, 0, all_nums, k, nums2.length);
        System.arraycopy(nums1, k, all_nums, k + nums2.length, nums1.length - k);
        return all_nums;
    }

    public static int[][] doTaskTen(int n) {
        int[][] matrix = new int[n][n];
        int[] string1 = new int[n];
        int[] string2 = new int[n];
        for (int i = 0; i < n; ++i) {
            string1[i] = i + 1;
            string2[i] = n - i;
        }
        for (int i = 0; i < n; ++i) {
            if ((i + 1) % 2 == 1) {
                matrix[i] = string1.clone();
            } else {
                matrix[i] = string2.clone();
            }
        }
        return matrix;
    }
}
