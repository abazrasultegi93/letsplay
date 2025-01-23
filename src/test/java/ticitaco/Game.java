package ticitaco;

import java.util.Scanner;

import static java.lang.System.in;


public class Game {
    static Scanner scanner = new Scanner(in);

    public static void main(String[] args) {
        // write your code here
        char[] game = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

        int input;
        char turn = 'X';
        int currentTurn = 1;

        while (true) {
            do {

                System.out.print("Enter the position: ");
                input = scanner.nextInt();
            } while (game[input - 1] == 'X' || game[input - 1] == 'O');

            game[input - 1] = turn;

            System.out.println(" " + game[6] + " | " + game[7] + " | " + game[8] + "  ");
            System.out.println("---+---+---");
            System.out.println(" " + game[3] + " | " + game[4] + " | " + game[5] + "  ");
            System.out.println("---+---+---");
            System.out.println(" " + game[0] + " | " + game[1] + " | " + game[2] + "  ");

            if (game[0] == turn && game[1] == turn && game[2] == turn
                    || game[3] == turn && game[4] == turn && game[5] == turn
                    || game[6] == turn && game[7] == turn && game[8] == turn
                    || game[6] == turn && game[3] == turn && game[0] == turn
                    || game[7] == turn && game[4] == turn && game[1] == turn
                    || game[8] == turn && game[5] == turn && game[2] == turn
                    || game[6] == turn && game[4] == turn && game[2] == turn
                    || game[8] == turn && game[4] == turn && game[0] == turn) {
                System.out.println(turn + " is the Winner");
                break;
            }


            if (turn == 'X') {
                turn = 'O';
            } else if (turn == 'O') {
                turn = 'X';
            }
            currentTurn++;
            if (currentTurn > 9) {
                System.out.println("Draw");
                break;
            }
        }

    }
}


//     6 |   7   | 8
//  ________________
//     3 |  4    | 5
//  ________________
//     0 |  1    |2