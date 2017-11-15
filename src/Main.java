/**
 * Class {@link Main} is main class in project
 *
 * @throws IOException
 * @author Uliana Stefanishyna
 * created on 2017/10/25
 * @version 1.0
 * @since 1.0
 */

import filler.Filling;
import sorters.*;
import sun.security.krb5.internal.crypto.Des;

import java.awt.geom.QuadCurve2D;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        analyzer();
    }

    public static void analyzer() {
        int arrayLength = 5_000;
        int stepForAnalyzing = 100;
        int[] arrayForSorting;
        int[] arrayForSortingClone;
        double[] arrayForSortingTime = new double[(arrayLength / stepForAnalyzing) * 6];

        ArrayList<Sorting> list = new ArrayList<>();

        list.add(new DefaultSorting());
        list.add(new DescendingBubbleSort());
        list.add(new AscendingBubbleSort());
        list.add(new CocktailSort());
        list.add(new MergeSort());
        list.add(new QuickSort()); //TODO: time for QuickSort does not measured properly

        //for (int j = 0, k = 0; j < arrayLength; j += stepForAnalyzing) { // [k] for arrayForSortingTime but need to think
            arrayForSorting = new int[1000];
            Filling.fillingRandom(arrayForSorting);
            for (int i = 0; i < 6; i++) {
                arrayForSortingClone = arrayForSorting.clone();
                list.get(i).sort(arrayForSortingClone, false);

                arrayForSortingTime[i] = list.get(i).timeToSort();
            }

            for(int i = 0; i < 6; i++) {
                System.out.println(arrayForSortingTime[i] + " ");
            }
        //}
    }
}