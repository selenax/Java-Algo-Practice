package recursion;

/*
Problem: Sum up all numbers from 1 to N using recursion
Approach:
1. add the current number n
2. recurse to add next N - 1
3. stop when n <= 1

Time: O(n)
Space: O(n) recursion stack
 */
public class SumToN {
    public static int sumToN(int n) {
        if (n <= 1) return 1;

        return n + sumToN(n - 1);
    }
}