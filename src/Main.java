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
import sorters.DefaultSorting;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int arrayLength = 10;
        int[] kickerNumbers = new int[arrayLength];

        DefaultSorting defaultSorting = new DefaultSorting();

        //for(int i = 100; i < 10000; i+=100){
        Filling.fillingRandom(kickerNumbers);
        defaultSorting.sort(kickerNumbers, false);
        //}

        System.out.println(defaultSorting.timeToSort());

    }
}


