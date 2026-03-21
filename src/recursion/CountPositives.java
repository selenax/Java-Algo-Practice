package recursion;
/*
Write a recursive method that counts the number of positive integers in a Multiset
Constraints:
    The set should not be changed as a result of the method call.
    Do not:
        create a duplicate copy of the set
        convert to an array or use a different data structure
        create any temporary data structure
 */
public class CountPositives {
    public static int countPositive(Multiset<Integer> set) {
        if(set.isEmpty()) return 0;
        Integer value = set.remove();

        int count = countPositive(set);
        if(value > 0) count++;

        set.add(value);  // add back
        return count;
    }
}
