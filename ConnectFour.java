import java.util.Arrays;
import java.util.Scanner;

public class ConnectFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What would you like the height of the board to be? ");
        int ht = scanner.nextInt();
        System.out.print("What would you like the length of the board to be? ");
        int lt = scanner.nextInt();
        char[][] board = new char[ht][lt];
        initializeBoard(board);
        printBoard(board);
        char p1 = 'x';
        char p2 = 'o';
        System.out.println("\nPlayer 1: " + p1);
        System.out.println("Player 2: " + p2);
        while (!boardFull(board)) {
            System.out.print("\nPlayer 1: Which column would you like to choose? ");
            int col = scanner.nextInt();
            int row = insertChip(board, col, p1);
            printBoard(board);
            if (checkIfWinner(board, col, row, p1)) {
                System.out.println("\nPlayer 1 won the game!");
                return;
            }
            if (boardFull(board)) {
                break;
            }
            System.out.print("\nPlayer 2: Which column would you like to choose? ");
            col = scanner.nextInt();
            row = insertChip(board, col, p2);
            printBoard(board);
            if (checkIfWinner(board, col, row, p2)) {
                System.out.print("\nPlayer 2 won the game!");
                return;
            }
        }
        System.out.println("\nDraw. Nobody wins.");
    }

    public static void printBoard(char[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }
    }
    public static void initializeBoard(char[][] array) {
        for (int row = 0; row < array.length; row++) {
            Arrays.fill(array[row], '-');
        }
    }
    public static int insertChip(char[][] array, int col, char chipType) {
        int row = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i][col] == '-') {
                row = i;
            }
            else {
                break;
            }
        }
        array[row][col] = chipType;
        return (row);
    }
    public static boolean checkIfWinner(char[][] array, int col, int row, char chipType) {
        int countV = 0;
        int countH = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i][col] == chipType) {
                countV++;
            }
            if (countV == 4) {
                return true;
            }
        }
        for (int j = 0; j < array[row].length; j++) {
            if (array[row][j] == chipType) {
                countH++;
            }
            if (countH == 4) {
                return true;
            }
        }
        return false;
    }
    public static boolean boardFull(char[][] array) {
        for (int i = 0; i < array[0].length; i++) {
            if (array[0][i] == '-') {
                return false;
            }
        }
        return true;
    }
}
