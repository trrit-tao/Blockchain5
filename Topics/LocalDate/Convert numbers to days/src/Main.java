import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(LocalDate.ofYearDay(a, scanner.nextInt()));
        System.out.println(LocalDate.ofYearDay(a, scanner.nextInt()));
        System.out.println(LocalDate.ofYearDay(a, scanner.nextInt()));
    }
}
