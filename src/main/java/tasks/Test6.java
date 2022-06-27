package tasks;

public class Test6 {
    public static void main(String[] args) {

        StringBuilder testString = new StringBuilder("asDdSa");
        String testString1 = testString.toString();
        StringBuilder reverseTestString = new StringBuilder(testString.reverse());
        String reverseTestString1 = reverseTestString.toString();
        if (testString1.equalsIgnoreCase(reverseTestString1)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
