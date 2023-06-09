package modules;

import static java.util.Objects.isNull;

public class Node {
    private final int value;
    private Node nextElement = null;
    private Node prevElement = null;

    public Node(int value) {
        this.value = value;
    }

    public void setPrev(Node prev) {
        prevElement = prev;
    }

    public Node getPrev() {
        return prevElement;
    }

    public void setNext(Node next) {
        nextElement = next;
    }

    public Node getNext() {
        return nextElement;
    }

    public boolean hasNext() {
        return !isNull(nextElement);
    }

    public boolean hasPrev() {
        return !isNull(prevElement);
    }

    public int getValue() {
        return value;
    }
}
