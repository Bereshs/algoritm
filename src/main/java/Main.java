import modules.BinarySearch;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dataArray = new int[4_000_000_00];

        for (int i = 0; i < dataArray.length; i++) {
            dataArray[i] = i;
        }
        int searchInt = scanner.nextInt();

        int searchResult = BinarySearch.intSearch(dataArray, searchInt);
        if(searchResult>=0) {
            System.out.println("Найдено значение " + dataArray[searchResult]
                    + " на позиции " + searchResult);

        }
    }
}
