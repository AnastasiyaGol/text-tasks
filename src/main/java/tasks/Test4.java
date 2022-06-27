package tasks;

public class Test4 {
    public static void main(String[] args) {

        String testString = "HeLLo world";
        int count = testString.length() - testString.replaceAll("[l+L]", "").length();
        System.out.println(count);
    }
}
