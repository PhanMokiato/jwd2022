package by.mokievets.task1.company;

import java.util.Scanner;

public class Input {
    public Scanner scan = new Scanner(System.in);
    public Output output = new Output();
    public Double enterPositiveDouble() {
        Double num;
        for( ; ; ) {
            num = scan.nextDouble();
            if (num > 0) {
                break;
            } else {
                output.enterRightNumbers();
            }
        }
        return num;
    }
    public int enterPositiveInt() {
        int num;
        for( ; ; ) {
            num = scan.nextInt();
            if (num > 0) {
                break;
            } else {
                output.enterRightNumbers();
            }
        }
        return num;
    }

    public int enterIntWithinRange(int length) {
        int num;
        for( ; ; ) {
            num = scan.nextInt();
            if (num > 0 && num < length) {
                break;
            } else {
                output.enterRightNumbers();
            }
        }
        return num;
    }

    public int[] enterArray(int[] array) {
        int length = array.length;
        for (int i = 0; i < length; ++i) {
            array[i] = scan.nextInt();
        }
        return array;
    }
}
