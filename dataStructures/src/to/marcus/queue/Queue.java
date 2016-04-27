package to.marcus.queue;

/**
 * Created by marcus on 20/04/16
 * Utilizing the first come first serve rule (FIFO)
 */
public class Queue {

    private int maxSize; //initializes the set number of slots
    private long[] queueArray; // slots to maintain the data
    private int front;  //index position of the element in the front
    private int rear;   //the index position for the element at the back of the line
    private int nItems; //counter to maintain the number of queue items

    public Queue(int size){
        this.maxSize = size;
        this.queueArray = new long[size];
        front = 0;  /// index pos of the first slot of the array
        rear = -1;  //no item in the array yet to be considered as the last item
        nItems = 0; //no elements yet
    }

    public void insert(long j){
        // if the maxSize has been reached, reset rear - not always needed unless doing the below
        if(rear == maxSize -1){
            rear = -1;
        }
        //then replace rear with pos 0, overwriting items (circular queue)
        rear++;
        queueArray[rear] = j;
        nItems ++;
    }

    public long remove(){ //remove item from the front of the queue
        long temp = queueArray[front];
        front++;
        if(front == maxSize){
            front = 0;  //we can reset front back to 0th index
        }
        nItems--;
        return temp;
    }

    public long peekFront(){
        return queueArray[front];
    }

    public boolean isEmpty(){
        return (nItems==0);
    }

    public boolean isFull(){
        return (nItems == maxSize);
    }

    public void view(){
        System.out.print("[ ");
        for(int i = 0; i < queueArray.length; i++){
            System.out.print(queueArray[i]+ " ");
        }
        System.out.print("]");
    }
}
