package com.aurionpro.test;

import java.util.Random;
import java.util.Scanner;

public class PigCalisthenics {


    public static void main(String[] args) {
        int score = 0;
        int turn = 1;
        int winScore = 20;

        while (score < winScore) {
            System.out.println("Turn " + turn);
            score = takeTurn(score,winScore);
            if (score >= winScore) {
                break;
            }
            turn++;
        }

        System.out.println("Total score: " + score);
        System.out.println("You finished in " + turn + " turns. \nGame over!");
    }

    private static int takeTurn(int score, int winScore) {
        boolean turnOver = false;
        int turnScore = 0;

        while (!turnOver) {
            char choice = getPlayerChoice();

            switch (choice) {
                case 'r':
                    int dieRoll = rollDie();
                    System.out.println("Die: " + dieRoll);

                    if (dieRoll == 1) {
                        System.out.println("Turn over. No score.");
                        score =0;
                        turnScore = 0;
                        turnOver = true;
                    } else {
                        turnScore += dieRoll;
                        score += dieRoll;

                       
						if (score >= winScore) {
                            turnOver = true;
                        }
                    }

                    break;

                case 'h':
                    System.out.println("Score for turn: " + turnScore);
                    System.out.println("Total score: " + score);
                    turnOver = true;
                    break;

                default:
                    System.out.println("Enter a valid choice!");
                    break;
            }
        }

        return score;
    }

    private static char getPlayerChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Roll or hold? (r/h)");
        return scanner.next().charAt(0);
    }

    private static int rollDie() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }
}
