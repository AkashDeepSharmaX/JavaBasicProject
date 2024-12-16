
import java.util.Scanner;

public class Bankingsys {

    Scanner sc = new Scanner(System.in);

    public String getInput(String msg) {
        System.out.println(msg);
        return sc.nextLine();
    }

    public int accountNumber(int AccNo, int Acc[]) {
        for (int i = 0; i < Acc.length; i++) {
            if (AccNo == Acc[i]) {
                System.out.println(" Account no found!" + Acc[i]);
                return i;
            }
        }
        return -1;
    }

    public void depositAmount(int index, int[] Balance) {
        System.out.println("Enter the amount you want to deposit:");
        int depositAmount = sc.nextInt();
        Balance[index] = Balance[index] + depositAmount;
        System.out.println("Deposit successful. Your new balance is: " + Balance[index]);
    }

    public void withdrawAmount(int index, int[] balance) {
        int withdrawAmount = sc.nextInt();
        if (withdrawAmount < balance[index]) {
            balance[index] = balance[index] - withdrawAmount;
            System.out.println("your current balance is: " + balance[index]);
        } else {
            System.out.println(" Insufficent balance ! ");
        }
    }

    public static void main(String[] arg) {
        Bankingsys bankingsys = new Bankingsys();
        System.out.println("Hello !! \n Welcome to Bank Management System");
        System.out.println("---------------------------------------------");
        System.out.println("Enter your Bank Acc no");
        int AccNo = bankingsys.sc.nextInt();
        int[] Acc = new int[3];
        Acc[0] = 101;
        Acc[1] = 102;
        Acc[2] = 103;
        int[] Balance = new int[3];
        Balance[0] = 5000;
        Balance[1] = 70000;
        Balance[2] = 91103;
        int accountIndex = bankingsys.accountNumber(AccNo, Acc);
        bankingsys.sc.nextLine();
        if (accountIndex!=-1){
            boolean bank = true;
            while(bank){
        System.out.println("Choose an option:");
        System.out.println(" press D for deposite money\n press W for withdraw money\n press E for exit  ");
        String answer = bankingsys.sc.nextLine();
        switch (answer.toLowerCase()) {
            case "d":
                bankingsys.depositAmount(accountIndex, Balance);
            case "w":
                bankingsys.withdrawAmount(accountIndex, Balance);
            case "e":
                System.out.println("thanks !!");
                bank  =false;
                break;
            default:
                System.out.println("invalid option");
        }
        }
        }

    }
}
