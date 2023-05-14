package modules;

public class BinarySearch {
    public static int intSearch(int[] dataArray, int searchInt) {
        int pointArrayStart = 0;
        int pointArrayStop = dataArray.length - 1;
        int pointArrayMiddle = (pointArrayStop - pointArrayStart) / 2;
        int count = 1;
        int interval;
        while (dataArray[pointArrayMiddle] != searchInt) {
            if (dataArray[pointArrayMiddle] > searchInt) {
                pointArrayStop = pointArrayMiddle - 1;
            }

            if (dataArray[pointArrayMiddle] < searchInt) {
                pointArrayStart = pointArrayMiddle + 1;
            }

            pointArrayMiddle = pointArrayStart + (pointArrayStop - pointArrayStart) / 2;
            if (dataArray[pointArrayStart] == searchInt) {
                pointArrayMiddle = pointArrayStart;
            }
            if (dataArray[pointArrayStop] == searchInt) {
                pointArrayMiddle = pointArrayStop;
            }
            interval = pointArrayStop - pointArrayStart;
            System.out.println("шаг " + count + " интервал [" + pointArrayStart + ":" + pointArrayStop +
                    "] количество значений " + (pointArrayStop - pointArrayStart) + " шт");
            count++;
            if (interval <= 1) {
                return -1;
            }

        }
    return pointArrayMiddle;
    }


}
