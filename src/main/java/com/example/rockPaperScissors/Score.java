package com.example.rockPaperScissors;

public class Score {
    private int player_score = 0;
    private int comp_score = 0;

    public Score() {
        player_score = 0;
        comp_score = 0;
    }


    public void Player() {
        //updates player Score
        this.player_score += 1;
    }

    public void Comp_score() {
        //updates computer score
        this.comp_score += 1;
    }

    public int GetPlayer() {
        //return player score
        int score = this.player_score;

        return score;
    }

    public int GetComp() {
        //return player score
        int score = this.comp_score;

        return score;
    }
}
