package by.mokievets.task1.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Output {
    public void enterRightNumbers() {
        System.out.println("Please, enter other number(s):");
    }
    public void writeThirdCondition() {
        System.out.println("Please, enter your numbers for the third task(positive, double):");
    }
    public void writeThirdAnswer(ArrayList<Double> params) {
        System.out.println("Perimeter is " + params.get(0) + ", square is " + params.get(1));
    }
    public void writeLength(String array) {
        System.out.println("Please, enter the length of the " + array + " array:");
    }
    public void writeElements(String array) {
        System.out.println("Please, enter the elements of the " + array + " array:");
    }
    public void writeIndex() {
        System.out.println("Please, enter the required index" +
                "(positive, integer, lower than first array's length):");
    }
    public void writeArray(int[] nums) {
        System.out.println("The new array is " + Arrays.toString(nums));
    }
    public void writeInt() {
        System.out.println("Please, enter positive integer:");
    }
    public void writeMatrix(int[][] matrix, int n) {
        for (int i = 0; i < n; ++i) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
