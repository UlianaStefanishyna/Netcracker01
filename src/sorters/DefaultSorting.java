package sorters;

import java.util.Arrays;

/**
 * Class {@link DefaultSorting} is the sorting algorithm from java-library
 *
 * @author Uliana Stefanishyna
 * created on 2017/10/25
 * @version 1.0
 * @see Sorting
 * @since 1.0
 */

@SuppressWarnings("unused")
public class DefaultSorting extends Sorting{
    @Override
    public void sort(int[] array, boolean doPrintSortedArray) {
        startTimer = System.nanoTime();

        Arrays.sort(array);

        endTimer = System.nanoTime();

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
        return "Default sort:  ";
    }
}
