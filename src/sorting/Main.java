package sorting;

import java.util.Arrays;

public class Main<T> {
    public static void main(String[] args) {
        int[] toSort = {7, 4, 5, 1, 8};
        selectionSort(toSort);
        System.out.println(Arrays.toString(toSort));
        String[] stringsArrayToSort = { "z", "g", "nddc", "7", "aaa", "iosdjcsnd iksdd", "iuiisjs"
        , " ", "1"};
        selectionSortForMethodThatImplementsComparbleInterface(stringsArrayToSort);
        System.out.println(Arrays.toString(stringsArrayToSort));
    }

    private static void selectionSort(int[] toSort) {
        int j = 0;
        while (j !=toSort.length - 1){
            int index = j;
            for (int i = j; i < toSort.length; i++) {
                if (toSort[i] < toSort[index]){
                    index = i;
                }
            }
            int box = toSort[j];
            toSort[j] = toSort[index];
            toSort[index] = box;
            j++;
        }
    }

    private static <T extends Comparable<T>>  void selectionSortForMethodThatImplementsComparbleInterface(T[] input) {

        for (int i = 0; i < input.length; i++) {
            int index = i;
            for (int j = i; j < input.length; j++) {
                if (input[j].compareTo(input[index]) < 0){
                    index = j;
                }
            }
            T box = input[i];
            input[i] = input[index];
            input[index] = box;
        }
    }
}
