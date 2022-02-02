package com.example.rockPaperScissors;

import java.util.Random;


public class comp_choice {
    private String message;

    public comp_choice() {

    }

    public String getChoice() {
        //create and returns a random number to choose weapon
        Random rand = new Random();
        int upperbound = 3;
        int int_random = rand.nextInt(upperbound);

        //uses the random number to pick weapon
        switch (int_random) {
            case 0:
                message = "Rock";
                break;
            case 1:
                message = "Scissors";
                break;
            case 2:
                message = "Paper";
                break;



        }

        return message;
    }
}
