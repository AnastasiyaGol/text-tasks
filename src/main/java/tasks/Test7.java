package tasks;

import java.util.Arrays;

public class Test7 {
    public static void main(String[] args) {

        String testString = "Thing-Night";
        String ts1 = testString.replaceAll("-(.*)", "");
        String ts2 = testString.replaceAll("(.*)-", "");
        ts1 = ts1.toLowerCase();
        ts2 = ts2.toLowerCase();
        char[] testArray1 = ts1.toCharArray();
        char[] testArray2 = ts2.toCharArray();
        Arrays.sort(testArray1);
        Arrays.sort(testArray2);
        String sortedArray1 = new String(testArray1);
        String sortedArray2 = new String(testArray2);
        if (sortedArray1.equals(sortedArray2)){
            System.out.println("The string is an anagram.");
        } else {
            System.out.println("The string is not an anagram.");
        }
    }
}
