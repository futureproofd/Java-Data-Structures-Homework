package to.marcus;

public class Main {

    //entry point
    public static void main(String[] args) {
        Stack theStack = new Stack(10);

        //should print 90 - Last in, first out (LIFO)
        while (!theStack.isEmpty()){
            long value = theStack.pop();
            System.out.println(value);
        }
        System.out.println(reverseString("hello"));


        //Queue test
        Queue myQueue = new Queue(5);
        myQueue.insert(100);
        myQueue.insert(200);
        myQueue.insert(300);
        myQueue.insert(400);
        myQueue.insert(50);
        myQueue.insert(600);
        myQueue.insert(700);
        myQueue.insert(800);

        myQueue.view();
    }

    public static String reverseString(String str){
        int stackSize = str.length(); // get the max stack size
        Stack theStack = new Stack(stackSize);
        for(int j = 0; j < str.length(); j++){
            char ch = str.charAt(j);
            theStack.push(ch);
        }

        //LIFO concept here: the last char in is the first that gets popped,
            //our string will return backwards
        String result = "";
        while(!theStack.isEmpty()){
            char ch = theStack.pop();
            result = result+ch; // appending to the output
        }
        return result;
    }
}
