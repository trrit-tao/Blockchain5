import java.util.Scanner;
import java.time.LocalDate;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LocalDate date = LocalDate.parse(s.nextLine());
        System.out.println(date.getDayOfYear() + " " + date.getDayOfMonth());
    }
}
