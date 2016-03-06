package javaclasses;

/**
 * Created by adamhurwitz on 2/27/16.
 */
public class InsertionSort {
    static private final String LOG_TAG = InsertionSort.class.getSimpleName();

    static int[] array = {22, 11, 85, 88, 9, 7, 42};

    public static void main(String[] arg) {
        System.out.println("Answer is: " + insertionSort(array));
    }

    public static String insertionSort(int[] array) {
        String solution = "";
        //TODO: Fix implementation
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;

            //solution = insertValue(array, array.length - 2, i);
        }
        for (int i = 0; i < array.length; i++) {
            solution += " " + array[i];
        }
        return solution;
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


    /*static int[] array = {3, 5, 7, 11, 13, 2, 9, 6};

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
    }*/
}
