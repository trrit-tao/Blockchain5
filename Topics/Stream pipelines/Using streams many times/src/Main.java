import javax.naming.NamingEnumeration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.*;

class FunctionUtils {

    public static <T> Supplier<Stream<T>> saveStream(Stream<T> stream) {
        List<Integer> list = (List<Integer>) stream.filter(e -> (int)e % 2 == 0).collect(Collectors.toList());

        long c = list.size();
        long max = list.stream().max(Integer::compareTo).get();
        long min = list.stream().min(Integer::compareTo).get();
        List <Integer> res = new ArrayList<>();
        res.add((int) c);
        res.add((int) max);
        res.add((int) min);
        Supplier<Stream<T>> streamSupplier = (Supplier<Stream<T>>) list.stream();


        return (Supplier<Stream<T>>) stream;
    }

}