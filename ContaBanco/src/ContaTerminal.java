import java.util.Scanner;

public class ContaTerminal 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter with the account number: ");
        int accountNumber = sc.nextInt();

        System.out.print("\nEnter with the agency number: ");
        String agency = sc.next();
        
        System.out.print("\nEnter with your name: ");
        String name = sc.next();
        
        System.out.print("\nEnter with the balance: ");
        double balance = sc.nextDouble();
        
        System.out.printf("Hello %s, thank you for open an account in our Bank, your agency number is %s, account %d and your balance is %.2f is already available. \n", name, agency, accountNumber, balance);

        sc.close();
    }
}