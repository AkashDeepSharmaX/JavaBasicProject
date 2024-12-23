import java.util.Scanner;

public class Tictactoe {
    public static void main(String[] args) {
        char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
        };

        Scanner sc = new Scanner(System.in);
        boolean gameRunning = true;

        System.out.println("Welcome to Tic Tac Toe!");
        while (gameRunning) {
        
            printBoard(board);

            System.out.println("Enter the row (0-2), column (0-2), and character (X or O) you want to place:");
            int row = sc.nextInt();
            int col = sc.nextInt();
            char symbol = sc.next().charAt(0);

           if (isValidMove(board, row, col)) {
                board[row][col] = symbol;
            } else {
                System.out.println("Invalid move. Try again.");
            }

            // Ask if the user wants to continue
            System.out.println("Do you want to continue? (yes or no)");
            String continueGame = sc.next();
            if (continueGame.equalsIgnoreCase("no")) {
                gameRunning = false;
            }
        }

        System.out.println("Final board:");
        printBoard(board);
        sc.close();
    }
    public static void printBoard(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
    public static boolean isValidMove(char[][] board, int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '-';
    }
}
