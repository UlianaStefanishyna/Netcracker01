package sorters;

/**
 * Class {@link AscendingBubbleSort} is the ascending bubble sorting algorithm
 *
 * @author Uliana Stefanishyna
 * created on 2017/10/25
 * @version 1.0
 * @see BubbleSort
 * @since 1.0
 */

@SuppressWarnings("unused")
public class AscendingBubbleSort extends BubbleSort {

    @Override
    public double timeToSort() {
        return (endTimer - startTimer) / Math.pow(10, 9);
    }

    @Override
    public String toString() {
        return "Ascending Bubble Sort: ";

    }

    @Override
    boolean isCompare(int a, int b) {
        return (a > b);
    }
}
