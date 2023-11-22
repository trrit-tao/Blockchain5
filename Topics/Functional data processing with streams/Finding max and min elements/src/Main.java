import java.util.*;
import java.util.function.*;
import java.util.stream.*;


class MinMax {

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        List<T> listStream = stream.collect(Collectors.toList());
            minMaxConsumer.accept(
                    listStream.stream().min(order).orElse(null)
                    , listStream.stream().max(order).orElse(null)
            );
    }
}