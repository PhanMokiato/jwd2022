package by.mokievets.task1.company;

import java.util.ArrayList;

import static by.mokievets.task1.company.AllTasks.*;

public class Main {

    public static void main(String[] args) {
        Input input = new Input();
        Output output = new Output();
        //Task Three
        output.writeThirdCondition();
        Double a = input.enterPositiveDouble();
        Double b = input.enterPositiveDouble();
        ArrayList<Double> params = doTaskThree(a, b);
        output.writeThirdAnswer(params);
        //Task Nine
        output.writeLength("first");
        int l1 = input.enterPositiveInt();
        int[] nums1 = new int[l1];
        output.writeElements("first");
        nums1 = input.enterArray(nums1);
        output.writeLength("second");
        int l2 = input.enterPositiveInt();
        int[] nums2 = new int[l2];
        output.writeElements("second");
        nums2 = input.enterArray(nums2);
        output.writeIndex();
        int k = input.enterIntWithinRange(l1);
        int[] nums = doTaskNine(nums1, nums2, k);
        output.writeArray(nums);
        //Task Ten
        output.writeInt();
        int n = input.enterPositiveInt();
        int[][] matrix = doTaskTen(n);
        output.writeMatrix(matrix, n);
    }
}
