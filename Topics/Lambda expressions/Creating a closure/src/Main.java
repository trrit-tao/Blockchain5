import java.util.function.UnaryOperator;

class PrefixSuffixOperator {
    public static String getAuthors(String s) {
return "";
    }

    public static final String PREFIX = "__pref__";
    public static final String SUFFIX = "__suff__";

    public static UnaryOperator<String> operator = PrefixSuffixOperator::getAuthors;




}