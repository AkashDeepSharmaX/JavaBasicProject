
import java.util.Scanner;

public class MainApp {

    Scanner sc = new Scanner(System.in);

    public int getInput(String msg) {
        System.out.println(msg);
        return sc.nextInt();

    }

    public static void main(String[] args) {
        int i = 0;

        while (i<5) { 
        String [] names =new String[5];
        MainApp mainApp = new MainApp();
        System.out.println("Enter your name");
        String name = mainApp.sc.nextLine();
        int sci = mainApp.getInput("Enter your Science marks");
        int math = mainApp.getInput("Enter your Math marks");
        int hindi = mainApp.getInput("Enter your Hindi marks");
        int eng = mainApp.getInput("Enter your English marks");
        int sst = mainApp.getInput("Enter your Social studies marks");
        int sum = sci +math+hindi+eng+sst;
        System.out.println("Total marks "+sum+"  Out of 500");
        float avg = sum/500*100;
        if (avg >= 90){
            System.out.println(" Grade  : A+ ");
        }
        else if (avg <=90){
            System.out.println(" Grade : A");
        }
        else if (avg >= 75) {
            System.out.println("Grade : B+");
        }
        else if (avg >=60){
            System.out.println("Grade : B");
        }
        else if (avg >= 50){
            System.out.println("Grade : C");
        }
        else if (avg <50){
            System.out.println("Try again buddy");
         

i++;
        }
    }
    }

    }
