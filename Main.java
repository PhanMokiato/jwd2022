package com.company;

import java.util.ArrayList;
import java.util.Arrays;

import static com.company.All_Tasks.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(TaskOne(3456) + " " + TaskOne(1203));

        System.out.println();
        System.out.println(TaskTwo(2, 3, 5));

        System.out.println();
        ArrayList<Double> Params = TaskThree(3.0, 4.0);
        System.out.println(Params.get(0) + " " + Params.get(1));

        System.out.println();
        System.out.println(TaskFour(-3, -4));

        System.out.println();
        ArrayList<Double> Numbers = new ArrayList<>();
        Numbers.add(3.0);
        Numbers.add(2.0);
        Numbers.add(-2.0);
        ArrayList<Double> NewNumbers = TaskFive(Numbers);
        System.out.println(NewNumbers.get(0) + " " + NewNumbers.get(1) + " " + NewNumbers.get(2));

        System.out.println();
        System.out.println(TaskSix(7, -11.5, 6));

        System.out.println();
        TaskSeven(0, 9, 2);
        System.out.println();

        int[] numbers2 = new int[] {3, 4, 7, 2, 5, 6};
        System.out.println(TaskEight(numbers2, 2));

        int[] numbers1 = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
        TaskNine(numbers1, numbers2, 3);

        System.out.println();
        int n = 5;
        int[][] matrix = TaskTen(n);
        for (int i = 0; i < n; ++i) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
