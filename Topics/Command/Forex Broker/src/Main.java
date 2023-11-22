import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] amountList = new int[3];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            amountList[i] = scanner.nextInt();
        }

        Broker broker = new Broker();
        for (int i = 0; i < 3; i++) {
            Option option = new Option(amountList[i]);
            Command command;
            if (amountList[i] > 0) {
                /* write your code here */
                command = new BuyCommand(option);//assign importance to "Command command"
            } else {
                /* write your code here */
                command = new SellCommand(option);//assign importance to "Command command"

            }
            broker.setCommand(command);
            broker.executeCommand();
        }
    }
}

class Option {
    private int amount;

    Option(int amount) {
        this.amount = amount;
    }

    void buy() {
        System.out.println(amount + " was bought");
    }

    void sell() {
        /* write your code here */
        System.out.println(amount + " was sold");//add output for sale
    }
}

interface Command {
    /* write your code here */
    void execute();//add method
}

class BuyCommand implements Command {
    private Option option;

    BuyCommand(Option option) {
        this.option = option;
    }

    /* write your code here */
    @Override
    public void execute() {
        option.buy();//implement a method for BuyCommand
    }
}

class SellCommand implements Command {
    private Option option;

    SellCommand(Option option) {
        this.option = option;
    }

    /* write your code here */
    @Override
    public void execute() {
        option.sell();//implement a method for SellCommand
    }
}

class Broker {
    private Command command;

    void setCommand(Command command) {
        /* write your code here */
        this.command = command;//initialize the field
    }

    void executeCommand() {
        /* write your code here */
        command.execute();//call the method on Command
    }
}