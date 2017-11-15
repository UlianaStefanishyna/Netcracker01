package sorters;
/**
 * Class {@link QuickSort} is the quick sorting algorithm
 *
 * @author Uliana Stefanishyna
 * created on 2017/10/25
 * @version 1.0
 * @see SortingSwap
 * @since 1.0
 */
@SuppressWarnings("unused")
public class QuickSort extends SortingSwap {
    private int[] array;
    private int number;

    @Override
    public void sort(int[] array, boolean doPrintSortedArray) {
        startTimer = System.nanoTime();

        if (array ==null || array.length==0){
            return;
        }
        this.array = array;
        number = array.length;
        quickSorting(0, number - 1);

        endTimer = System.nanoTime();

        if(doPrintSortedArray){
            System.out.println(toString());
            printArray(array);
        }


    }
    private void quickSorting(int low, int high) {
        int i = low, j = high;
        int pivot = array[low + (high-low)/2];
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(array,i,j);
                i++;
                j--;
            }
        }
        if (low < j)
            quickSorting(low, j);
        if (i < high)
            quickSorting(i, high);
    }

    @Override
    public double timeToSort() {
        return (endTimer-startTimer)/Math.pow(10,9);
    }

    @Override
    public String toString() {
        return "Quick sort:  ";
    }
}
