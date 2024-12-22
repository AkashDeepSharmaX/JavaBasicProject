
import java.util.Scanner;

public class Tictactoe {
               Scanner sc = new Scanner(System.in);
               public char getInput(String msg) {
                              System.out.println(msg);
                              return sc.next().charAt(0); }
               public static void main(String[] args) {
                              Tictactoe tictactoe=new Tictactoe();
                char[][] array = new char[3][3];
             int row=   tictactoe.getInput("enter the row ");

               int column=  tictactoe.getInput("enter the column");
                if (row>3 && column>3){
                    System.out.println("value can't be greater ");
                }

            


                
               }
}