import modules.BinarySearch;
import modules.SelectionSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] dataArray = new int[400000];

        for (int i = 0; i < dataArray.length; i++) {
            double randomValue =  Math.random()*1000;
            dataArray[i] = (int) randomValue;
        }
        
        System.out.println(Arrays.toString(dataArray));
        System.out.println(Arrays.toString(SelectionSort.sort(dataArray)));
    }
}
