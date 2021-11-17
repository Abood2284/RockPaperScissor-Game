package com.company;
import java.util.Random;
import java.util.Scanner;

public class _20_Exercise2 {
    public static void main(String[] args) throws InterruptedException {
        Random rand = new Random();
        int rand1 = rand.nextInt(2);   // rand1 will store random integer numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("...Rules for this Rock, Paper, Scissor Game...");
        System.out.println("Enter the number according to the Accordance: ");
        System.out.println("0 -> Rock");
        System.out.println("1 -> Paper");
        System.out.println("2 -> Scissor");
        Thread.sleep(3000); // Will make your function sleep for 3 seconds
        System.out.println("With that Set lets begin our game");

        int temp_win = 0;
        int temp_lose = 0;

        System.out.print("How many matches you want to play, to decide the real winner:=> ");
        int times_play = sc.nextInt();
        int time_play_temp = 0;
//        String Choice1;

        do {

            System.out.print("--> Enter your choice: ");
            int User_Choice = sc.nextInt();

            switch (User_Choice) {
                case 0 -> System.out.println("\tYou Choose Rock");
                case 1 -> System.out.println("\tYou Choose Paper");
                case 2 -> System.out.println("\tYou Choose Scissor");
            }
            System.out.println("--> Waiting for Computer's Choice");
            Thread.sleep(1000);
            switch (rand1) {
                case 0 -> System.out.println("\tComputer Choose Rock");
                case 1 -> System.out.println("\tComputer Choose Paper");
                case 2 -> System.out.println("\tComputer Choose Scissor");
            }

            System.out.println("Generating Result...");
            Thread.sleep(1000);
            if (rand1 == User_Choice) {
                System.out.println("Match Draw");
                temp_lose += 1;
                temp_win += 1;
            } else if ((rand1 == 0 && User_Choice == 1) || (rand1 == 1 && User_Choice == 2) || (rand1 == 2 && User_Choice == 0)) {
                System.out.println("You Won!!! :)");
                temp_win += 1;

            } else {
                System.out.println("Better Luck Next Time");
                temp_lose += 1;
            }

            time_play_temp += 1;
        } while (time_play_temp < times_play);

        System.out.println(">>> Calculating the Real winner");
        if (temp_win > temp_lose){
            System.out.println("You are as a WINNER! with "+temp_win+" wins");
        }else if (temp_win == temp_lose){
            System.out.println("Sorry that match has declared a draw");
        }
        else {
            System.out.println("Sorry You Lost with "+temp_lose+" Score");
        }

    }
}
