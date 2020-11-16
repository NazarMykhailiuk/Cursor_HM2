package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        System.out.print("Task1\nFor my mind, arrays in Java are initialize with fixed size and can’t be dynamic, for minimization mistakes.\nFixed objects are much easier to work. \nThey can be only in one condition and they are easily to be shared.");
        System.out.println("\n\nTask2:\n" + "Standart:");
        Integer A[] = new Integer[]{2, 3, 1, 7, 11};
        showArray(A);
        reverseSortArray(A);

        System.out.println("\n\nTask3:");
        Integer B[] = new Integer[]{10, -25, 30, 20, -50, 40, -10};
        positiveSumNumbers (B);
        System.out.println("Sum positive numbers: " + positiveSumNumbers (B));
        negativeSumNumbers (B);
        System.out.println("Sum negative numbers: " + negativeSumNumbers (B));

        System.out.println("\nTask4:");
        Integer [] C = {10, 5, 30, 4, 10};
        averageNumbers (C);
        System.out.println("Average value of the list of numbers: " + averageNumbers (C));

        System.out.println("\nTask5:");
        Integer[] D = new Integer[]{3, 2, 3, 1, 4, 2, 8, 3};
        System.out.println("Original array");
        showArray(D);
        System.out.println("\nArray after duplicates replaced");
        replaceDuplicatedValues (D);
    }
    public static void showArray(Integer[] array) {
        for (int i = 0; i < array.length; i++){
            System.out.print(array [i] + " ");
        }
    }

    public static void reverseSortArray(Integer[] array) {
        System.out.print("\nSorted: \n");
        Arrays.sort(array, Collections.reverseOrder());
        showArray(array);
    }

    public static int positiveSumNumbers(Integer[] array) {
        int sum = 0;
        for (int num : array) {
            if (num > 0)
                sum += num;
        }
        return sum;
    }

    public static int negativeSumNumbers(Integer[] array) {
        int sum = 0;
        for (int num : array) {
            if (num < 0)
                sum += num;
        }
        return sum;
    }

    public static float averageNumbers(Integer[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / (float)array.length;
    }
    public static void replaceDuplicatedValues(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == j) continue;
                if (array[i].equals(array[j])) {
                    array[j] = 0;
                }
            }
        }
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
