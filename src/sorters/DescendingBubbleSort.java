package sorters;

/**
 * Class {@link DescendingBubbleSort} is the descending bubble sorting algorithm
 *
 * @author Uliana Stefanishyna
 * created on 2017/10/25
 * @version 1.0
 * @see BubbleSort
 * @since 1.0
 */
@SuppressWarnings("unused")
public class DescendingBubbleSort extends BubbleSort {
    @Override
    public double timeToSort() {
        return (endTimer - startTimer) / Math.pow(10, 9);
    }

    @Override
    public String toString() {
        return "Descending Bubble Sort: ";
    }

    @Override
    boolean isCompare(int a, int b) {
        return (a < b);
    }
}