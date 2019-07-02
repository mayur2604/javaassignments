package IncAssignment6;

public class SListIterator<T> {

    private SNode<T> head=null;

    public SListIterator(SNode<T> head){
        this.head=head;
    }
    void insert(T data){
        if(head==null){
            head=new SNode<>(data);return;
        }
        SNode<T> temp=head;
        while(head.getNext()!=null){
            head=head.getNext();
        }
        head.setNext(new SNode<>(data));
        head=temp;

    }
    void remove(T data){
        if(head==null) {
            System.out.println("List is Empty");
            return;
        }
        if(head.getData()==data){
            head=head.getNext();
            return;
        }
        SNode<T> temp=head;
        while(head!=null && head.getNext().getData()!=data){
            head=head.getNext();
        }
        SNode<T> tmp=head.getNext();
        head.setNext(head.getNext().getNext());
        tmp.setNext(null);
        head=temp;
    }
    public String toString() {
        String list="";
        SNode<T> tmp=head;
        while(tmp!=null){
            list+=tmp.getData()+" ";
            tmp=tmp.getNext();
        }
        if(list.equals(""))
            return "list is empty";
        return list;
    }

}
