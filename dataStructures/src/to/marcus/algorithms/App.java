package to.marcus.algorithms;

/**
 * Created by marcus on 5/2/2016
 *
 * Linear Search O(n) Big 'O' scales linearly - will have to iterate over every element until an object is found
 *
 * Binary Search: made up of 3 indexes: p, q, r
 *  p - the beginning element
 *  q - the middle element
 *  r - the last element
 */
public class App {

    public static void main(String[] args){
        System.out.println(binarySearch(new int[]{1,2,4,8,16,32,64,128,256}, 256));
    }

    //simple binary search: returns position of search
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

}
