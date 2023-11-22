import java.util.function.*;

class FunctionUtils {

    public static Supplier<Integer> getInfiniteRange() {
        return new Supplier<Integer>() {
            int num = 0;
            @Override
            public Integer get() {
                return num++;
            }
        };
    }
}