package com.example.stonepaperscissor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

package javaapplication2;
import java.util.Scanner;

class JavaApplication2{
    public static void main(String args[]){
        String re_run;
        String[] choiceStack= {"rock","paper","scissors"};
        int randomNum = (int) (3*Math.random());
        String computerChoice = choiceStack[randomNum];

        System.out.println("Welcome to the game Rock,Paper and Scissors");
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in rock,paper or scissors");
        String userChoice;
//        userChoice = userChoice.toLowerCase();
        userChoice = sc.nextLine();

        if(computerChoice.equals(userChoice)){
            System.out.println("Tie!");
        }
        else if(userChoice.equals("paper") && computerChoice.equals("rock")){
            System.out.println("You win!");
        }
        else if(userChoice.equals("rock") && computerChoice.equals("scissors")){
            System.out.println("You win!");
        }
        else if(userChoice.equals("scissors") && computerChoice.equals("rock")){
            System.out.println("You loose!");
        }
        else if(userChoice.equals("rock") && computerChoice.equals("paper")){
            System.out.println("You loose!");
        }
        else if(userChoice.equals("paper") && computerChoice.equals("scissors")){
            System.out.println("You loose!");
        }
        else if(userChoice.equals("scissors") && computerChoice.equals("paper")){
            System.out.println("You win!");
        }
        else{
            System.out.println("Provide a valid input");
        }
    }
}
