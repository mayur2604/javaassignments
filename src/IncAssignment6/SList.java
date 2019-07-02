package IncAssignment6;

public class SList<T> {
    private SNode<T> head = null;
    private SListIterator<T> iterator = null;


    @Override
    public String toString() {
        if (iterator == null)
            return "list is empty";
        return iterator.toString();
    }

    public SListIterator iterator() {
        return iterator = new SListIterator(head);
    }
}
