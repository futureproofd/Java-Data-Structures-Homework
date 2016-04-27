package to.marcus.linkedLists;

/**
 *   singly directional linked list
  *  All of the nodes only know of the 'next' one
 */

public class SinglyLinkedList{
    private Node first;

    public SinglyLinkedList(){

    }

    //the beginning of the list (first)
    public boolean isEmpty(){
        return (first == null);
    }

    //used to insert at the beginning of the list
    //newNode becomes first by replacing its data and assigning the current 'first' to its 'next' value
    public void insertFirst(int nodeData){
        Node newNode = new Node();
        newNode.data = nodeData;
        newNode.next = first;
        first = newNode;
    }

    //create a temporary first
    // new first becomes the current next of current first
    public Node deleteFirst(){
        Node temp = first;
        first = first.next;
        return temp;
    }

    public void displayList(){
        System.out.println("List (first -- > Last)");
        Node current = first;
        while(current != null){
            current.displayNode();
            current = current.next;
        }
    }

    public void insertLast(int data){
        Node current = first;
        while(current.next != null){
            current = current.next; //loop until current.next is null
        }
        Node newNode = new Node();
        newNode.data=data;
        //since we've broken out of the loop, it means next is null (the end of the list)
        //so we can assign the newNode to the last item
        current.next = newNode;

    }


}


