package modules;

import static java.util.Objects.isNull;

public class LineSearch {

    public static Node recurseNextSearch(int value, Node firstElement) {
        if(isNull(firstElement)) {
            return null;
        }
        if(firstElement.getValue()==value) {
            return firstElement;
        }
        Node nextElement = firstElement.getNext();
        return        recurseNextSearch(value, nextElement);
    }

}
