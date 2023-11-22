import java.util.Scanner;

public class Main {

    /* Fix this method */
    public static int method(int n) {
        if (n == 0) {
            return 1;
        } else {
            return 2 * method(n - 1);
        }
    }

    /* Do not change code below */
    public static void main(String[] args) {
        method();
    }
}