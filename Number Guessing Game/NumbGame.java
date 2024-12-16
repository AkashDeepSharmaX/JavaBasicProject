import java.util.*;

public class NumbGame {

    public static void main(String[] args) {

        Random random = new Random();
        int ranNum = random.nextInt(10);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a Number:");
            int givenNum = sc.nextInt();

            if (givenNum==ranNum) {
                System.out.println("Your guess is amazing!! The number was: " + ranNum);
                break; 
            } else if (givenNum< ranNum) {
                System.out.println("The number is greater than your guess.");
            } else if (givenNum>ranNum) {
                System.out.println("The number is less than your guess.");
            }
        }

    }
}
