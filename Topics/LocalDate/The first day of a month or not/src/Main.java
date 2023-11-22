import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yearInput = scanner.nextInt();
        int numMonthInput = scanner.nextInt();

        LocalDate date = LocalDate.ofYearDay(yearInput, numMonthInput);
        int monthNum = date.getDayOfMonth();

        System.out.println(monthNum == 1);
    }
}