import java.time.temporal.ChronoField;
import java.util.Scanner;
import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        Instant instant = Instant.ofEpochSecond(987654L);
        System.out.println(instant.getEpochSecond());
    }
}