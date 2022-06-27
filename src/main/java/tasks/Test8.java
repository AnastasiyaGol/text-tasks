package tasks;

import java.util.stream.Stream;

public class Test8 {
    public static void main(String[] args) {

        Stream.iterate(new int[]{0, 1}, arr -> new int[]{arr[1], arr[0]+ arr[1]})
                .limit(10)
                .map(y -> y[0])
                .forEach(x -> System.out.println(x));
    }
}
