package sorters;

/**
 * Class {@link MergeSort} is the merge sorting algorithm
 *
 * @author Uliana Stefanishyna
 * created on 2017/10/25
 * @version 1.0
 * @see Sorting
 * @since 1.0
 */

@SuppressWarnings("unused")
public class MergeSort extends Sorting {
    private int[] array;
    private int[] helper;

    private int number;

    @Override
    public void sort(int[] array, boolean doPrintSortedArray) {
        startTimer = System.nanoTime();

        this.array = array;
        number = array.length;
        this.helper = new int[number];
        mergesort(0, number - 1);

        endTimer = System.nanoTime();

        if (doPrintSortedArray) {
            System.out.println(toString());
            printArray(array);
        }
    }

    private void mergesort(int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            mergesort(low, middle);
            mergesort(middle + 1, high);
            merge(low, middle, high);
        }
    }

    private void merge(int low, int middle, int high) {
        for (int i = low; i <= high; i++) {
            helper[i] = array[i];
        }
        int i = low;
        int j = middle + 1;
        int k = low;
        while (i <= middle && j <= high) {
            if (helper[i] <= helper[j]) {
                array[k] = helper[i];
                i++;
            } else {
                array[k] = helper[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = helper[i];
            k++;
            i++;
        }
    }

    @Override
    public double timeToSort() {
        return (endTimer - startTimer) / Math.pow(10, 9);
    }

    @Override
    public String toString() {
        return "Merge sort: ";
    }
}
