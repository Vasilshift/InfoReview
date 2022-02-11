package Collections.IsPalindrome;

public class MainPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Was it a cat I saw"));

    }
    public static boolean isPalindrome(String text) {
        String nowhitespace = new String();
        nowhitespace = text.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String reversedString = new StringBuilder(nowhitespace).reverse().toString();
        return reversedString.matches(nowhitespace);
    }
}
