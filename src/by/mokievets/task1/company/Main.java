package by.mokievets.task1.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static by.mokievets.task1.company.AllTasks.*;


public class Main {

    public static void main(String[] args) {
        //Task Three
        System.out.println("Please enter your numbers for task 3:");
        Scanner scan = new Scanner(System.in);
        Double a = scan.nextDouble();
        Double b = scan.nextDouble();
        ArrayList<Double> params = doTaskThree(a, b);
        System.out.println("Perimeter is " + params.get(0) + ", square is " + params.get(1));
        //Task Four
        System.out.println("Please enter x and y of your point:");
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        System.out.println("The statement that your point is in the chosen area is " + doTaskFour(x, y));
        //Task Nine
        System.out.println("Please enter the length of your first array:");
        int l1 = scan.nextInt();
        int[] nums1 = new int[l1];
        System.out.println("Please enter the elements of your first array:");
        for (int i = 0; i < l1; ++i) {
            nums1[i] = scan.nextInt();
        }
        System.out.println("Please enter the length of your second array:");
        int l2 = scan.nextInt();
        int[] nums2 = new int[l2];
        System.out.println("Please enter the elements of your second array:");
        for (int i = 0; i < l2; ++i) {
            nums2[i] = scan.nextInt();
        }
        System.out.println("Please enter the index of the first array, " +
                "after which you would like to insert the second array");
        int k = scan.nextInt();
        int[] all_nums = doTaskNine(nums1, nums2, k);
        System.out.println("The new array is " + Arrays.toString(all_nums));
        //Task Ten
        System.out.println("Please enter the size of your matrix:");
        int n = scan.nextInt();
        int[][] matrix = doTaskTen(n);
        for (int i = 0; i < n; ++i) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
