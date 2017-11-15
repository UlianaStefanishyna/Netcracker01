package sorters;

/**
 * Class {@code {@link Sorting}} is abstract class for all sorting algorithms
 * There are three abstract mathods
 * {@code String toString()}
 * It overrides in all sortings and uses for printing name of sorting algorithm to console
 *
 * {@code double timeToSort}
 * It overrides in all sortings and uses for calculating time to sort each algotithms
 *
 * {@code void sort(int[], boolean)}
 * It overrides in all sortings and uses for sorting an array of {@code int} type by each algorithm
 *
 * {@code void printArray(int[])}
 * It uses for printing array to console
 *
 * @author Uliana Stefanishyna
 * created on 2017/10/25
 * @version 1.0
 * @since 1.0
 */
abstract class Sorting {
    public abstract double timeToSort();
    public abstract String toString();
    public abstract void sort(int[] array, boolean doPrintSortedArray);
    long startTimer;
    long endTimer;

    public void printArray(int[] array){
        if(array.length > 20)
            return;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

abstract class SortingSwap extends Sorting{

    static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

abstract class BubbleSort extends SortingSwap {

    abstract boolean isCompare(int a, int b);

    @Override
    public void sort(int[] array, boolean doPrintSortedArray) {
        startTimer = System.nanoTime();

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (isCompare(array[j],array[j + 1])) {
                    swap(array, j, j + 1);
                }
            }
        }

        endTimer = System.nanoTime();

        if (doPrintSortedArray) {
            System.out.println(toString());
            printArray(array);
        }
    }
}