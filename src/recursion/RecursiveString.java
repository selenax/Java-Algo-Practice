package recursion;

public class RecursiveString {

    public static void main(String[] args) {
        printCharacters("hello");
        printCharacters("");
        printCharacters_Efficient("hello!");
        printCharacters_Efficient("");
    }

    private static void printCharacters(String word) {
        if (word.length() != 0) {
            System.out.println(word.charAt(0));
            printCharacters(word.substring(1));
        }
    }

    private static void printCharacters_Efficient(String word) {
        printCharactersHelper(word, 0);
    }

    private static void printCharactersHelper(String word, int index) {
        if (index < word.length()) {
            System.out.println(word.charAt(index));
            printCharactersHelper(word, index + 1);
        }
    }

}
