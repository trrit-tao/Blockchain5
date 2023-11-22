import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        LocalTime a = LocalTime.parse("00:20:15").minusSeconds(615);
        LocalTime s =LocalTime.parse("23:50").plusMinutes(20);
        LocalTime d =LocalTime.parse("05:05").plusHours(5).plusMinutes(5);
        LocalTime f =LocalTime.parse("00:05").withMinute(5);
        LocalTime g =LocalTime.parse("01:10:10").withSecond(0).minusHours(1);

        System.out.println(a);
        System.out.println(s);
        System.out.println(d);
        System.out.println(f);
        System.out.println(g);
    }
}