package org.lickingheights;

import java.util.Scanner;

public class Main {
    String[] computerOptions = new String[3];
    String computerChoice;
    boolean running = true;
    int playerChoice;
    String choice;
    Scanner keyboard = new Scanner(System.in);

    public  void start(){
        computerOptions[0] = "Rock";
        computerOptions[1] = "Paper";
        computerOptions[2] = "Scissors";

    }

    public static void main(String[] args) {
        Main instance = new Main();
        System.out.println("Let's start the game of Rock, Paper, and Scissors!");
        while (instance.running){
            System.out.println("Type 1 for Rock");
            System.out.println("Type 2 for Paper");
            System.out.println("Type 3 for Scissors");

            instance.playerChoice = instance.keyboard.nextInt();
           //(The player choose what they want)

        }

    }
    public void weapon(){
        if (playerChoice == 1){
            choice = "Rock";
        }
        else if (playerChoice == 2){
            choice = "Paper";
        }
        else if (playerChoice == 3){
            choice = "Scissors";
        }

    }
}
