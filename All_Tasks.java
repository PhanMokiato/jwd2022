package com.company;

import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;

public class All_Tasks {
    static boolean TaskOne(int number) {
        int thousand = number / 1000;
        int hundred = (number / 100) % 10;
        int ten = (number / 10) % 10;
        int one = number % 10;
        return thousand + hundred == ten + one;
    }
    static double TaskTwo(double a, double b, double c) {
       return (b + Math.pow(b * b + 4 * a * c, 0.5)) / 2 / a - Math.pow(a, 3) * c + Math.pow(b, -2);
    }
    static ArrayList<Double> TaskThree(Double a, Double b) {
        Double c = Math.pow(a * a + b * b, 0.5);
        ArrayList<Double> Parametrs = new ArrayList<>();
        Parametrs.add(a + b + c);
        Parametrs.add(0.5 * a * b);
        return Parametrs;
    }
    static boolean TaskFour(double x, double y) {
        return ((x >= - 2) && (x <= 2) && (y >= 0) && (y <= 4)) || ((x >= -4) && (x <= 4) && (y <= 0) && (y >= -3));
    }
    static ArrayList<Double> TaskFive(ArrayList<Double> Numbers) {
        ArrayList<Double> NewNumbers = new ArrayList<>();
        for (int i = 0; i < 3; ++i) {
            if (Numbers.get(i) >= 0) {
                NewNumbers.add(Math.pow(Numbers.get(i), 2));
            } else {
                NewNumbers.add(Math.pow(Numbers.get(i), 4));
            }
        }
        return NewNumbers;
    }

    static double TaskSix(double a, double b, double c) {
        double Max = Math.max(a, b);
        Max = Math.max(Max, c);
        double Min = Math.min(a, b);
        Min = Math.min(Min, c);
        return Max + Min;
    }

    static void TaskSeven(double a, double b, double h) {
        System.out.println("x  y");
        double x = a;
        while(x <= b) {
            double y = Math.pow(Math.sin(x), 2) - Math.cos(2 * x);
            System.out.println(x + " " + y);
            x += h;
        }
    }

    static int TaskEight(int[] A, double K) {
        int sum = 0;
        for (int j : A) {
            if (j % K == 0) {
                sum += j;
            }
        }
        return sum;
    }

    static void TaskNine(int[] nums1, int[] nums2, int k) {
        int[] all_nums = new int[nums1.length + nums2.length];
        Arrays.fill(all_nums, 0);
        System.arraycopy(nums1, 0, all_nums, 0, k);
        System.arraycopy(nums2, 0, all_nums, k, nums2.length);
        System.arraycopy(nums1, k, all_nums, k + nums2.length, nums1.length - k);
        System.out.println(Arrays.toString(all_nums));
    }

    static int[][] TaskTen(int n) {
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
