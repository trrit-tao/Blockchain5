import java.time.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Instant instant  = Instant.EPOCH;

        System.out.println(instant.plus(Period.ofWeeks(1)).atZone(ZoneId.of("GMT+4")));
    }
}