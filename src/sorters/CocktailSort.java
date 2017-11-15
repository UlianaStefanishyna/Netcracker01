package sorters;
/**
 * Class {@link CocktailSort} is the cocktail sorting algorithm
 *
 * @author Uliana Stefanishyna
 * created on 2017/10/25
 * @version 1.0
 * @see SortingSwap
 * @since 1.0
 */
@SuppressWarnings("unused")
public class CocktailSort extends SortingSwap{

    @Override
    public void sort(int[] array, boolean doPrintSortedArray ){
        boolean swapped;
        do {
            swapped = false;
            for (int i =0; i<=  array.length  - 2;i++) {
                if (array[ i ] > array[ i + 1 ]) {
                    swap(array,i,i+1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            swapped = false;
            for (int i= array.length - 2;i>=0;i--) {
                if (array[ i ] > array[ i + 1 ]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1]=temp;
                    swapped = true;
                }
            }
        } while (swapped);
        if(doPrintSortedArray){
            System.out.println(toString());
            printArray(array);
        }
    }

    @Override
    public double timeToSort() {
        return (endTimer-startTimer)/Math.pow(10,9);
    }

    @Override
    public String toString() {
        return "Cocktail sort: ";
    }
}