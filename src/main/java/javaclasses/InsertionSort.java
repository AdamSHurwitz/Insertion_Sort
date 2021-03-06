package javaclasses;

/**
 * Created by adamhurwitz on 2/27/16.
 */
public class InsertionSort {
    static private final String LOG_TAG = InsertionSort.class.getSimpleName();

    static int[] A = {22, 11, 85, 888, 9, 7, 42};

    public static void main(String[] arg) {
        System.out.println("Answer is: " + insertionSort(A));
    }

    public static String insertionSort(int[] A) {
        String solution = "";
        for (int b = 1; b < A.length; b++) {
            // key to keep track of which element currently is being evaluated
            int temp = A[b];
            int a = b - 1;
            while (a >= 0 && A[a] > temp) {
                A[a + 1] = A[a];
                a--;
            }
            A[a + 1] = temp;
        }

        for (int i = 0; i < A.length; i++) {
            solution += " " + A[i];
        }
        return solution;
    }
}


// insertValue() exercise

    /*static int[] A
     = {3, 5, 7, 11, 13, 2, 9, 6};

    public static void main(String[] arg) {
        System.out.println("Answer is: " + insertValue(A
        , 4, 2));
        System.out.println("Answer is: " + insertValue(A
        , 5, 9));
        System.out.println("Answer is: " + insertValue(A
        , 6, 6));
    }

    public static String insertValue(int[] A
    , int rightIndex, int value) {
        String solution = "";

        for (int compareIndex = A
        .length; compareIndex >= 0; compareIndex--) {
            //System.out.println(compareIndex);
            if (compareIndex <= rightIndex && A
            [compareIndex] > value) {
                int temp = A
                [compareIndex + 1];
                A
                [compareIndex + 1] = A
                [compareIndex];
                A
                [compareIndex] = temp;
            }
        }

        System.out.println("A
         Length " + A
         .length);

        for (int i = 0; i < A
        .length; i++) {
            solution += " " + A
            [i];
        }
        return solution;
    }*/
