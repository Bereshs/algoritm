package modules;

public class SelectionSort {
    public static int findBiggest(int[] arrayData) {
        int biggestIndexElement = 0;
        int biggestElement =0;
        for(int i=0; i<arrayData.length;i++) {
            if(arrayData[i]>=arrayData[biggestIndexElement]) {
                biggestIndexElement=i;
                biggestElement=arrayData[biggestIndexElement];
            }
        }
        arrayData[biggestIndexElement]=0;
        return biggestElement;
    }
    public static int[] sort(int[] arrayData) {
        int[] sortedArray =  new int[arrayData.length];
            for (int i=0;i<arrayData.length; i++) {
                sortedArray[i]=findBiggest(arrayData);
            }
        return sortedArray;
    }
}
