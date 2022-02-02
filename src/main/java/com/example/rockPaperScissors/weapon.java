package com.example.rockPaperScissors;

public enum weapon {

    ROCK("Rock"),
    PAPER("Paper"),
    SCISSORS("Scissors");
    private String message;

    private weapon(String msg) { message = msg; }


    @Override
    public String toString() { return message; }

};
