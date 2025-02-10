package module;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AtmInterface op = new AtmOperation();
        int atmNumber = 12345;
        int atmPin = 123;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter atm number: ");
        int atmnumber = input.nextInt();
        System.out.print("Enter atm pin: ");
        int atmpin = input.nextInt();
        if (atmNumber == atmnumber && atmpin == atmPin) {
            while (true) {
                System.out.println("1.View Balance\n2.Witdraw Amount\n3.Deposit Amount\n4.View Ministatement\n.5.Exit");
                System.out.println("Enter your choice: ");
                int ch = input.nextInt();
                if (ch == 1) {
                    op.viewBalance();

                } else if (ch == 2) {
                    System.out.print("Enter Withdraw amount: ");
                    double withdrawAmount = input.nextDouble();
                    op.withdrawAmount(withdrawAmount);


                } else if (ch == 3) {
                    System.out.print("Enter how much: ");
                    double depositAmount = input.nextDouble();
                    op.depositAmount(depositAmount);

                } else if (ch == 4) {
                    op.viewMiniStatement();

                } else if (ch == 5) {
                    System.out.println("Collect your card!\n Thank You!");
                    break;
                }
                else  {
                    System.out.println("Enter correct choice: ");
                }

            }
        } else {
            System.out.println("Invalid atm number");
            System.exit(0);
        }
    }
}