import modules.LineSearch;
import modules.OneWayLinkedList;
import modules.TwoWayLinkedList;

public class Main {

    public static void main(String[] args) {
        int[] dataArray = new int[400000];
        OneWayLinkedList onWayLinkedList = new OneWayLinkedList();
        TwoWayLinkedList twoWayLinkedList = new TwoWayLinkedList();
        int searchValue=0;
        for (int i = 0; i < 12; i++) {
            double randomValue = Math.random() * 1000;
            twoWayLinkedList.put((int) randomValue);
            if(i==6) {
                searchValue = (int) randomValue;
            }
            System.out.println((int) randomValue);
        }

        System.out.println(twoWayLinkedList.size());
        System.out.println("------------------------");

        twoWayLinkedList.getLastElement();
        for(int i = 0 ; i< twoWayLinkedList.size(); i++) {
            System.out.println(twoWayLinkedList.getPrev().getValue());
        }

        System.out.println("------------------------");
        System.out.println(LineSearch.recurseNextSearch(searchValue, twoWayLinkedList.getFirst()).getValue());
    }
}
