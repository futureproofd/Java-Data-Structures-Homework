package to.marcus.linkedLists;

/**
 * Created by marcus on 20/04/16.
 * Run our linked list nodes
 */
public class App {

    public static void main(String[] args){
        Node nodeA = new Node();
        nodeA.data = 4;

        Node nodeB = new Node();
        nodeB.data = 3;

        Node nodeC = new Node();
        nodeC.data = 7;

        Node nodeD = new Node();
        nodeD.data = 8;

        // link nodes together, (a pointer to another object in memory!)
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;

        System.out.print(listLength(nodeD)); //1
        System.out.print(listLength(nodeA)); //4


    }

    //think of a linked list as a train with multiple carts (node#.next refers to the next node)
    public static int listLength(Node node){
        int i = 0;
        Node currentNode = node;
        while(currentNode != null){
            i++;
            currentNode = currentNode.next;
        }
        return i;
    }
}
