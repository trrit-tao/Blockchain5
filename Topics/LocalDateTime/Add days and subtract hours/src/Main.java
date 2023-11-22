import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] splitInput = scanner.nextLine().split(" ");
        LocalDateTime localDateTime = LocalDateTime.parse(splitInput[0]);
        System.out.println(localDateTime
                .plusDays(Integer.parseInt(splitInput[1]))
                .minusHours(Integer.parseInt(splitInput[2]))
        );
    }
}