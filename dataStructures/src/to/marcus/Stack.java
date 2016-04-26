package to.marcus;

/**
 * Created by marcus on 18/04/16
 * a general idea of a stack:
 *  for instance, reverse a words spelling with this stack data structure
 */
public class Stack {
    private int maxSize;
    private char[] stackArray;

    //index of last item:
    private int top;

    public Stack(int size){
        this.maxSize = size;
        //initialize stack with this size
        this.stackArray = new char[maxSize];

        //there is nothing on the top (last item will be 0 position)
        this.top = -1;
    }

    //add to stack
    public void push(char j){
        if(isFull()){
            System.out.println("stack is already full");
        } else {
            top++;
            stackArray[top] = j;
        }
    }


    public char pop(){
        if(isEmpty()){
            System.out.println("stack is already empty");
            return '0';
        }else{
            int oldTop = top;
            top--;
            return stackArray[oldTop];
        }
    }

    public long peak(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (maxSize -1 == top);
    }


}
