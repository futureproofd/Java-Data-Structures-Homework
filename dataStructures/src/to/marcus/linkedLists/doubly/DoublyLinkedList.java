package to.marcus.linkedLists.doubly;

/**
 * Created by marcus on 4/28/2016
 */
public class DoublyLinkedList {
    private Node first;
    private Node last;  //these instance variables are pointers to node objects in the list

    public DoublyLinkedList(){
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty()){
            last = newNode;
        }else{
            first.previous = newNode;
        }
        newNode.next = first; //new nodes next field will point to the old first
        this.first = newNode;
    }

    public void insertLast(int data){
        Node newNode = new Node();
        newNode.data = data;

        if(isEmpty()){
            first = newNode;
        }else{
            last.next = newNode;   //assign old last to new node
            newNode.previous = last; //old last will be the new nodes previous
        }
        last = newNode; //the linkedList last field instance should point to the new node
    }

    //assume non-empty list (refer to diagram)
    public Node deleteFirst(){
        Node temp = first;
        if(first.next == null){ //only one item in the list
            last = null;
        }else{
            first.next.previous = null; //the lists first node will point to null
        }
        first = first.next; //assign the reference of the node following hte old first node to the first field in the linked list object
        return temp; //return the deleted old first node
    }

    //assume non-empty list
    public Node deleteLast(){
        Node temp = last;
        if(first.next == null){ //only one node in this list
            first = null;
        }else{
            last.previous.next = null;  //node before last should point to nothing
        }
        last = last.previous; //assign last reference variable to the node before the one we are deleting
        return temp;
    }

    //assume non-empty list
    /**
     *     insert a new node after a given node
     *     identify the node with the given data key that you want to insert after
     */
    public boolean insertAfter(int key, int data){
        Node current = first; // start from beginning of the list
        while(current.data != key){ //loop until we land on the key
            current = current.next;
            if(current == null){
                //key doesn't exist
                return false;
            }
        }
        Node newNode = new Node();
        newNode.data = data;

        if(current == last){
            current.next = null;
            last = newNode;
        }else{
            newNode.next = current.next;    // new nodes next field should point to the node ahead of the current
            current.next.previous = newNode; //reference back to the newly inserted node.
        }
        newNode.previous = current;
        current.next = newNode;

        return true;
    }
}
