package sorters;

import fillers.Filling;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortTest {
    MergeSort mergeSort;
    int[] array = new int[10];

    @Before
    public void setUp() throws Exception {
        new MergeSort();
    }

    @After
    public void tearDown() throws Exception {
        mergeSort = null;
    }

    @Test
    public void sort(int[] array) throws Exception {
        for(int i = 0; i < 10; i++)
            array[i] = i;
        //assertArrayEquals(Arrays.sort(array),mergeSort.sort(array,false));
    }

}