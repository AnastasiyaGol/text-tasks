package tasks;

public class Task2 {

    public static void main(String[] args) {

        StringBuilder testString = new StringBuilder("Device");
        System.out.println(testString);
        System.out.println(testString.replace(4, 5, "s"));
    }
}