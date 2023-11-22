import java.util.*;
import java.util.function.ToIntFunction;

class Utils {
    static List<Integer> one = new ArrayList<>();
    static List<Integer> two = new ArrayList<>();

    public static List<Integer> sortOddEven(List<Integer> numbers) {
        numbers.sort(Comparator
                .comparingInt((ToIntFunction<Integer>) x -> (x % 2) == 0 ? 1 : -1)
                .thenComparingInt((ToIntFunction<Integer>) x -> (x % 2) == 0 ? -x : x));
        return numbers;
    }
}