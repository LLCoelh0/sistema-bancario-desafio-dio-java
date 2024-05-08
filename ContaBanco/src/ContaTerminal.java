import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        //int number = 0;
        //String agency = "Null";
        //String clientName = "Null";
        //double balance = 0.0;

        Scanner scNumber = new Scanner(System.in);
        System.out.print("Enter with the account number:");
        int accountNumber = scNumber.nextInt();

        Scanner scAgency = new Scanner(System.in);
        System.out.print("Enter with the agency number:");
        String agency = scAgency.nextLine();

        Scanner scName = new Scanner(System.in);
        System.out.print("Enter with your name:");
        String name = scName.nextLine();

        Scanner scBalance = new Scanner(System.in);
        System.out.print("Enter with the balance: ");
        double balance = scBalance.nextDouble();

        System.out.printf("Hello %s, thank you for open an account in our Bank, your agency number is %s, account %d and your balance is %2f is already available.", name, agency, accountNumber, balance);

    }
}