import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String text = scanner.nextLine();

    //  If X is 609348676234, Y is 3077, the sum is 609348679311.
    Pattern pattern = Pattern.compile("\\d{10,}" , Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher(text);
    while (matcher.find()){
      System.out.println(matcher.group()+":"+(matcher.end() - matcher.start()));
    }
  }
}