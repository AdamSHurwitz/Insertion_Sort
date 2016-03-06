package javaclasses;

/**
 * Created by adamhurwitz on 2/27/16.
 */
public class InsertionSort {
    static private final String LOG_TAG = InsertionSort.class.getSimpleName();

    static int[] array = {3, 5, 7, 11, 13, 2, 9, 6};

    public static void main(String[] arg) {
        System.out.println("Answer is: " + insertValue(array, 4, 2));
    }

    public static String insertValue(int[] array, int rightIndex, int value) {
        String solution = "";
        int[] newArray = new int[array.length + 1];

        for (int compareIndex = array.length; compareIndex >= 0; compareIndex--) {
            //System.out.println(compareIndex);
            if (compareIndex > rightIndex) {
                newArray[compareIndex] = array[compareIndex - 1];
            } else {
                if (compareIndex == 0) {
                    newArray[compareIndex + 1] = array[compareIndex];
                    newArray[compareIndex] = value;
                } else if (array[compareIndex] > value) {
                    newArray[compareIndex + 1] = array[compareIndex];
                } else {
                    newArray[compareIndex] = value;
                }
            }
        }

        System.out.println("Array Length " + newArray.length);

        for (int i = 0; i < newArray.length; i++) {
            solution += " " + newArray[i];
        }
        return solution;
    }
}
