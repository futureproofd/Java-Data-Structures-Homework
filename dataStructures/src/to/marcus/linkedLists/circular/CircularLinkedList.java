package to.marcus.linkedLists.circular;

/**
 * Created by marcus on 4/27/2016
 * Similar to the singlyLinkedList but it has an extra 'last' reference to the last node
 * (A CircularLinkedList can also be used as the underlying container for a stack/queue
 * All of the nodes only know of the 'next' one
 *
 * A singlyLinkedList is less efficient because you have to traverse the entire list to get to the last node
 */
public class CircularLinkedList {
    private Node first;
    private Node last;

    public CircularLinkedList(){
        first = null;
        last = null;
    }


    private boolean isEmpty() {
        return first==null;
    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty()){
            last = newNode;
        }
        newNode.next = first; //new node assigned to old first
        first = newNode; // first place
    }

    public void insertLast(int data){
        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty()){
            first = newNode;
        }else{
            last.next = newNode; // the next value of the last node will point to the new node
            last = newNode; //new node we created becomes the last one in the list
        }
    }

    public int deleteFirst(){
        int temp = first.data;
        if(first.next==null){
            last = null;
        }
        first = first.next; // the next node now needs to be the first node
        return temp;
    }

    public void displayList(){
        System.out.println("List (first -- > Last)");
        Node current = first;
        while(current != null){
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

}
