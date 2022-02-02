package com.example.rockPaperScissors;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import java.util.Random;

import rockPaperScissors.R;

public class MainActivity extends AppCompatActivity {
    Random rand = new Random();


    private TextView comp_choice;
    private TextView score;
    private TextView outputField;
    comp_choice Choice = new comp_choice();
    Win win = new Win();
    private String Player;
    private String computer;
    private TextView winner;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.rock_input).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view){
                Player =  weapon.ROCK.toString();
                computer = Choice.getChoice();

                //Output the player choice to given text field
                outputField = (TextView)view.getRootView().findViewById(R.id.player_choice);
                outputField.setText("Player Weapon: " +  weapon.ROCK.toString());
                Choice.getChoice();

                //Output the Computer choice to given text field
                comp_choice = (TextView)view.getRootView().findViewById(R.id.computer_choice);
                comp_choice.setText("Computer Weapon: " + computer );

                win.whoWins(Player,computer);
                //Output the score to given text field
                score = (TextView)view.getRootView().findViewById(R.id.score_output);
                score.setText("Player: " + win.getPlayer() + " Computer: " + win.getComp());
                //Output the winner to given text field
                winner = (TextView)view.getRootView().findViewById(R.id.outcome_out);
                winner.setText("The winner is " + win.getWinner());






            }

        });
        findViewById(R.id.paper_input).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Player =  weapon.PAPER.toString();
                computer = Choice.getChoice();
                //Output the player choice to given text field
                outputField = (TextView)view.getRootView().findViewById(R.id.player_choice);
                outputField.setText("Player Weapon: " +  weapon.PAPER.toString());

                //Output the Computer choice to given text field
                comp_choice = (TextView)view.getRootView().findViewById(R.id.computer_choice);
                comp_choice.setText("Computer Weapon: " + computer );

                win.whoWins(Player,computer);
                //Output the score to given text field
                score = (TextView)view.getRootView().findViewById(R.id.score_output);
                score.setText("Player: " + win.getPlayer() + " Computer: " + win.getComp());
                //Output the winner to given text field
                winner = (TextView)view.getRootView().findViewById(R.id.outcome_out);
                winner.setText("The winner is " + win.getWinner());



            }
        });


        findViewById(R.id.scissors_input).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Player = weapon.SCISSORS.toString();
                computer = Choice.getChoice();
                //Output the player choice to given text field
                outputField = (TextView) view.getRootView().findViewById(R.id.player_choice);
                outputField.setText("Player Weapon: " + weapon.SCISSORS.toString());

                //Output the Computer choice to given text field
                comp_choice = (TextView) view.getRootView().findViewById(R.id.computer_choice);
                comp_choice.setText("Computer Weapon: " + computer);

                win.whoWins(Player, computer);
                //Output the score to given text field
                score = (TextView) view.getRootView().findViewById(R.id.score_output);
                score.setText("Player: " + win.getPlayer() + " Computer: " + win.getComp());
                //Output the winner to given text field
                winner = (TextView) view.getRootView().findViewById(R.id.outcome_out);
                winner.setText("The winner is " + win.getWinner());


            }

        });
    }
}