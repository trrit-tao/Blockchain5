// do not remove imports
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

class ArrayUtils {
    // define invert method here
    public static <T> T[] invert(T[] array){
        for (int i = 0; i < array.length / 2; i++) {
            T swap = array[i];
            array[i] = array[array.length-i-1];
            array[array.length-i-1] = swap;
        }
        return array;
    }
}