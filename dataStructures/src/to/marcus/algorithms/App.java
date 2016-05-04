package to.marcus.algorithms;

/**
 * Created by marcus on 5/2/2016
 *
 * Different algorithm examples:
 *
 * Linear Search O(n) Big 'O' scales linearly - will have to iterate over every element until an object is found
 *
 * Binary Search: made up of 3 indexes: p, q, r
 *  p - the beginning element
 *  q - the middle element
 *  r - the last element
 */
public class App {

    public static void main(String[] args) {
        //System.out.println(binarySearch(new int[]{1,2,4,8,16,32,64,128,256}, 256));

        //reduceByOne(10);

        //System.out.println(recursiveLinearSearch(new int[]{1,2,4,8,16,32,64,128,256}, 0, 256));

        //remember* binary search only works on a sorted array
       //System.out.println(recursiveBinarySearch(new int[]{1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048}, 0, 11, 64));

        //test sorting
       // int[] myTestArray = selectionSort(new int[]{2, 8, 1, 32, 256, 64, 512, 16, 4, 128});
        //for (int i = 0; i < myTestArray.length; i++) {
         //   System.out.println(myTestArray[i]);
        //}

        //test insertion sort
        int[] myTestArray2 = insertionSort(new int[]{2, 8, 1, 32, 256, 64, 512, 16, 4, 128});
        for (int i = 0; i < myTestArray2.length; i++) {
            System.out.println(myTestArray2[i]);
        }
    }

    /**
     *   simple binary search: divide and conquer
     * @param a the array
     * @param x the search
     * @return the position
     */
    public static int binarySearch(int [] a, int x){
        int p = 0; //beginning of range
        int r = a.length - 1; //last position

        while(p <= r){
            int q = (p+r)/2;    // the mid-point (divided by 2)
            if(x < a[q]){       // x is less than the mid-point
                r = q-1;        // narrow search to first half of array
            }else if(x > a[q]){
                p = q+1;        // narrow search to last half of array
            }else{
                return q;       // otherwise, its found.
            }
        }
        return -1;              //loop exits but no result
    }

    /**
     * Recursion
     * Reduce n every iteration to avoid stackOverflow
     * @param n
     */
    public static void reduceByOne(int n){
        if(n >= 0){
            reduceByOne(n-1);
        }
        System.out.println("Completed call: "+ n);
    }


    /**
     * Recursive linear search (only after final return, do the stacked methods get called)
     * @param a the array to search in
     * @param i the starting position in array being searched
     * @param x the search value
     * @return
     */
    public static int recursiveLinearSearch(int []a, int i, int x){
        if(i > a.length-1){ //x not found in array
            return -1;
        }else if(a[i] == x){
            return i;
        }else{
            System.out.println("index at: " + i);
            return recursiveLinearSearch(a, i+1, x);   //increment i +1
        }
    }

    /**
     * Recursive binary search - similar to simple binary search method
     * @param a the array to search within
     * @param p the first position of array
     * @param r the last element of the array
     * @param x the search term
     * @return the position of x in array a
     */
    public static int recursiveBinarySearch(int[] a, int p, int r, int x){
        System.out.println(p + "..." + r); //visualize output of binary array splitting
        if(p > r){
            return -1;
        }else{
            int q = (p+r)/2;
            if(a[q] == x){
                return q;
            }else if(a[q] > x){
                return recursiveBinarySearch(a,p,q-1,x);
            }else{
                return recursiveBinarySearch(a,q+1,r,x);
            }
        }
    }

    /**
     * Sort an array
     * @param a the array to sort
     * @return the sorted array in ascending order
     */
    public static int[] selectionSort(int a[]){
        for(int i=0; i < a.length; i++){
            int minimum = i;
            for(int j = i+1; j < a.length; j++){    //need to compare values 1 ahead of initial for loop
                if(a[j] < a[minimum]){              // if we find a smaller value
                    minimum = j;
                }
            }
            int temp = a[i];
            a[i] = a[minimum];
            a[minimum] = temp;
        }
        return a;
    }

    /**
     * Insertion sorting: use debug to see step-by-step
     * @param a the array to sort
     * @return the sorted array in ascending order
     */
    public static int[] insertionSort(int[] a){
    //0th slot is considered already sorted (in the sorted section)
        for(int i = 1; i < a.length; i++){
            int element = a[i];                     //element variable contains the data we intend on bringing over to the sorted area
            int j = i -1;                           //index pos of the last value in sorted area
            while(j >= 0 && a[j] > element){        //if j (element before) is greater, swap
                a[j+1] = a[j];
                j--;                                //j decrements and exits while loop
            }
            a[j+1] = element;                       //decremented j then swaps elements value
        }
        return a;
    }
}
