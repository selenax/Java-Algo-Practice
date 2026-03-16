package recursion;

/*
 Problem: return # of times char appears in string
 Approach:
 1. check current index match target
 2. check next index
 3. base case: when index reaches the end of string

 Time: O(n); 1 recursive call per n
 Space: O(n); recursion stack depth n
 */
public class CharFrequency {
    public static int charFrequency(String word, char target) {
        return charFrequency(word, target, 0);
    }

    public static int charFrequency(String word, char target, int index) {
        int count = 0;
        if (index == word.length()) {
            return count;
        }

        if (word.charAt(index) == target) {
            count++;
        }
        return count + charFrequency(word, target, index + 1);
    }
}
