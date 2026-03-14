package recursion;
import java.util.Arrays;

/*
Problem: Double each value in an array using recursion
Approach:
1. Process current index
2. Multiply value by 2
3. Recurse to next index

Time: O(n)
Space: O(n) recursion stack
*/
public class RecursiveArray {
    public static void main(String[] args) {
    
        int[] array = {1,2,3,4,5};
        doubleArray(array);
        System.out.print(Arrays.toString(array));
    }

    // double the elements in an array
    public static void doubleArray(int[] array) {
        doubleArrayHelper(array, 0);
    }
    private static void doubleArrayHelper(int[] array, int index) {
        if(index < array.length) {
        array[index] = array[index] * 2;
        doubleArrayHelper(array, index + 1);
        }
    }
}
