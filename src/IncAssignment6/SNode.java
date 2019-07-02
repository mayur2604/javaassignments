package IncAssignment6;

public class SNode<T> {
    private T data;
    private SNode<T> next;

    public SNode(T data) {
        this.data = data;
        this.next = null;
    }

    public SNode getNext() {
        return this.next;
    }

    public void setNext(SNode<T> next) {
        this.next = next;
    }

    public T getData() {
        return this.data;
    }

}
