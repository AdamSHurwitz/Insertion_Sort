package javaclasses;

/**
 * Created by adamhurwitz on 2/27/16.
 */
public class InsertionSort {
    static private final String LOG_TAG = InsertionSort.class.getSimpleName();

    static int[] array = {3, 5, 7, 11, 13, 2, 9, 6};

    public static void main(String[] arg) {
        System.out.println("Answer is: " + insertValue(array, 4, 2));
        System.out.println("Answer is: " + insertValue(array, 5, 9));
        System.out.println("Answer is: " + insertValue(array, 6, 6));
    }

    public static String insertValue(int[] array, int rightIndex, int value) {
        String solution = "";

        for (int compareIndex = array.length; compareIndex >= 0; compareIndex--) {
            //System.out.println(compareIndex);
            if (compareIndex <= rightIndex && array[compareIndex] > value) {
                int temp = array[compareIndex + 1];
                array[compareIndex + 1] = array[compareIndex];
                array[compareIndex] = temp;
            }
        }

        System.out.println("Array Length " + array.length);

        for (int i = 0; i < array.length; i++) {
            solution += " " + array[i];
        }
        return solution;
    }
}
