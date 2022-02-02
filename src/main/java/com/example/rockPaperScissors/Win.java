package com.example.rockPaperScissors;

public class Win {
    Score Score = new Score();
    private String Winner;


    public Win(){
    }

    public void whoWins(String player, String comp){
        if (player == "Rock" && comp == "Scissors"){
            Score.Player();
            Winner = "Player";
        }
        else if (player == "Scissors" && comp == "Paper"){
            Score.Player();
            Winner = "Player";
        }

        else if (player == "Paper" && comp == "Rock"){
            Score.Player();
            Winner = "Player";
        }

        else if (player == "Scissors" && comp == "Rock"){
            Score.Comp_score();
            Winner = "Computer";
        }

        else if (player == "Rock" && comp == "Paper"){
            Score.Comp_score();
            Winner = "Computer";
        }
        else if (player == "Paper" && comp == "Scissors"){
            Score.Comp_score();
            Winner = "Computer";
        }
        else if (player == comp ){
            Winner = "Tie Game";
        }

    }
    public int getPlayer(){
        return Score.GetPlayer();
    }
    public int getComp(){
        return Score.GetComp();
    }
    public String getWinner(){
        return Winner;
    }


}
