package recursion;

/*
 Problem: return # of times char appears in string

 Approach:
 1. check current index match target
 2. check next index
 3. base case: when index reaches the end of string

 2 Methods:
    - Index recursion:
         Time: O(n); 1 recursive call per n
         Space: O(n); recursion stack depth n
    - Substring recursion:
         Time: O(n^2); 1 recursive call + make copy of string per n
         Space: O(n^2); depth n + new string each call

 */
public class CharFrequency {

    // Method 1: helper method
        // Most efficient - updates index pointer each call vs each call creates a new substring
    public static int charFrequency(String word, char target) {
        return charFrequencyHelper(word, target, 0);
    }

    public static int charFrequencyHelper(String word, char target, int index) {
        int count = 0;
        if (index == word.length()) {
            return count;
        }

        if (word.charAt(index) == target) {
            count++;
        }
        return count + charFrequencyHelper(word, target, index + 1);
    }

    // Method 2: update local variable with recursive call and return variable
    public static int charFrequencyMethod2(String word, char target) {

        if(word.isEmpty()) return 0;

        int count = charFrequencyMethod2(word.substring(1), target);
        if(word.charAt(0) == target) count++;
        return count;
    }

    // Method 3: return recursive call
    public static int charFrequencyMethod3(String word, char target) {

        int count = 0;
        if(word.isEmpty()) return 0;
        if(word.charAt(0) == target) count++;
        return count + charFrequencyMethod3(word.substring(1), target);
    }
}
