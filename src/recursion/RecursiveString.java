package recursion;

public class RecursiveString {

    public static void main(String[] args) {
        printCharacters("hello");
        printCharacters("");
    }

    private static void printCharacters(String word) {
        if (word.length() != 0) {
            System.out.println(word.charAt(0));
            printCharacters(word.substring(1));
        }
    }

}
