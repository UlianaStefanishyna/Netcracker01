/**
 * Class {@link fillers.Filling} uses for filling each array with different values
 * There are four methods for filling an array
 *
 * {@code fillingRandom(int[])}
 * It uses for filling by random values
 *
 * {@code fillingAlreadySorted(int[])}
 * It uses for filling by already sorted values
 *
 * {@code fillingSortedPlusRand(int[])}
 * It uses for filling by already sorted values plus a random one
 *
 * {@code fillingReverseSorted(int[])}
 * It uses for filling by sorted values in reverse order
 *
 * @author Uliana Stefanishyna
 * created on 2017/10/25
 * @version 1.0
 * @since 1.0
 */

package filler;

public class Filling {

    @SuppressWarnings("unused")
    public static void fillingRandom(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random()*100 + 28);
        }
    }
    @SuppressWarnings("unused")
    public static void fillingAlreadySorted(int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = i+1;
        }
    }
    @SuppressWarnings("unused")
    public static void fillingSortedPlusRand(int[] array){
        fillingAlreadySorted(array);
        array[array.length-1] = (int) (Math.random()*100 + 28);
    }
    @SuppressWarnings("unused")
    public static void fillingReverseSorted(int[] array){
        for(int i = 0; i < array.length; i++){
            array[i] = array.length - i;
        }
    }
}
