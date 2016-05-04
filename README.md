# JavaHomework
refresher exercises on Data Structures and Algorithms.

An important concept for first/last instance variables is that they are reference pointers to Node objects.

##### Doubly Linked List Diagram:

![for reference](https://github.com/futureproofd/JavaHomework/blob/master/assets/screencaps/doublydiagram.png)

##### Binary Search concept:

![for reference](https://github.com/futureproofd/JavaHomework/blob/master/assets/screencaps/binary_concept.png)

##### Big O notation:

![Example](https://github.com/futureproofd/JavaHomework/blob/master/assets/screencaps/big_o_notation.png)

A constant is a straight, horizontal line (same number of steps) per input: O(1)

A linear algorithm increases the number of steps to the input consistently, linearly relative to the size of the input: O(n) - a single loop

A quadratic algorithm increases steeply, requiring a higher number of steps per input: O(n2) - or a nested loop

##### Logarithmic scaling:

![Example](https://github.com/futureproofd/JavaHomework/blob/master/assets/screencaps/logarithmic.png)

A Logarithmic algorithm, O(log n) is faster than the previous algorithms, since we are dividing the input size (the inverse of exponentiation)

##### Insertion Sorting:

![Example](https://github.com/futureproofd/JavaHomework/blob/master/assets/screencaps/insertion_sort.png)

Establishes a sorted (j) and unsorted area (element)

##### Merge Sorting:

[Visual example](https://upload.wikimedia.org/wikipedia/commons/c/cc/Merge-sort-example-300px.gif)

Similar to the 'divide and conquer' approach in Binary search. 

1. Splitting - split initial array into half, then keep dividing the arrays into half using mergeSort recursively, for  both left and right arrays. 
				This will arrive to a point where there is only a single element in each array (base case: if(p < r))
2. Merge the data back into two arrays
3. both arrays are merged