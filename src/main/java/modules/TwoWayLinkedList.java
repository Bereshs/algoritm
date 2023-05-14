package modules;

public class TwoWayLinkedList extends OneWayLinkedList {

    public Node getPrev() {
        if (super.getCurrent().hasPrev()) {
            Node prevNode;
            Node prev = super.getCurrent().getPrev();
            prevNode = super.getCurrent();
            super.setCurrent(prev);
            return prevNode;
        }
        return super.getCurrent();
    }

    public void put(int value) {
        Node lastNode = super.getLast();
        super.put(value);
        Node newLast = super.getLast();
        newLast.setPrev(lastNode);

    }
}
