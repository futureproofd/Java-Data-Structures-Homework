package to.marcus.linkedLists;

//singly directional linked list
public class SinglyLinkedList{
    private Node first;

    public SinglyLinkedList(){

    }

    //the beginning of the list (first)
    public boolean isEmpty(){
        return (first == null);
    }

    //used to insert at the beginning of the list
    //newNode becomes first
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


}


