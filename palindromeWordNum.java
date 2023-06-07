public class palindromeWordNum {
    public static void main(String[] args) {
        String original = "abba"; // the word being tested
        String reversed = "";

        // original string will be tested by reversing each of characters/numbers
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        // displays the original and reversed letter/number of the given problem.
        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversed + "\n");

        // condition that will tell the user if the given word is a palindrome or not.
        if (original.equals(reversed)) {
            System.out.println(original + " is a palindrome.");
        }
        else {
            System.out.println(original + " is not a palindrome.");
        }
    }
}