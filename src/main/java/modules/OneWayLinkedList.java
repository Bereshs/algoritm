package modules;

import static java.util.Objects.isNull;

public class OneWayLinkedList {


    private Node firstElement;
    private Node lastElement;
    private Node currentElement;
    private int size;

    public OneWayLinkedList() {
        firstElement = null;
        lastElement = null;
        currentElement = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public void put(int value) {
        if (isNull(lastElement)) {
            lastElement = new Node(value);
            firstElement = lastElement;
            currentElement = lastElement;
            size++;
            return;
        }
        Node lastCurrentElement = lastElement;
        lastElement = new Node(value);
        lastCurrentElement.setNext(lastElement);
        size++;
    }

    public Node getCurrent() {
        return currentElement;
    }

    public void setCurrent(Node node) {
        currentElement = node;
    }

    public int getCurrentValue() {
        return currentElement.getValue();
    }

    public int getNext() {
        if (currentElement.hasNext()) {
            currentElement = currentElement.getNext();
        }
        return getCurrentValue();
    }

    public int getFirstElement() {
        currentElement = firstElement;
        return getCurrentValue();
    }

    public int getLastElement() {
        currentElement = lastElement;
        return getCurrentValue();
    }
    public Node getLast() {
        return lastElement;
    }
    public boolean hasNext() {
        return currentElement.hasNext();
    }
    public int pop() {
        int value = firstElement.getValue();
        if(firstElement.hasNext()) {
            firstElement = firstElement.getNext();
        }
        size--;
        return value;
    }

}
