package to.marcus.linkedLists.doubly;

/**
 * Created by marcus on 20/04/16
 * Doubly Linked list nodes - representation of an object that a doubly linked list would use
 * contains extra, previous field
 */
public class Node {
    public int data;
    public Node next;
    public Node previous;


    public void displayNode(){
        System.out.println(data);
    }
}
