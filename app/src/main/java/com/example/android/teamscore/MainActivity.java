package com.example.android.teamscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;
    int peekA = 0;
    int peekB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plusThreePointsA (View v){
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }
    public void plusThreePointsB (View v){
        scoreB = scoreB + 3;
         displayForTeamB(scoreB);
    }
    public void plusTwoPointsA (View v){
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }
    public void plusTwoPointsB (View v){
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }
    public void freeThrowA (View v){
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }
    public void reduceByOneA (View v){
        scoreA = scoreA - 1;
        if(scoreA<0){
            scoreA=0;
        }
        displayForTeamA(scoreA);
    }
    public void freeThrowB (View v){
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }
    public void reduceByOneB (View v){
        scoreB = scoreB - 1;
        if(scoreB<0){
            scoreB=0;
        }
        displayForTeamB(scoreB);
    }
    public void clearA (View v){
        scoreA = 0;
        displayForTeamA(scoreA);
    }
    public void clearB (View v){
       scoreB = 0;
        displayForTeamB(scoreB);
    }
    public void resetFlush (View v){
        displayForTeamA(0);
        displayForTeamB(0);
    }
    public void quickPeak (View v){
        displayForTeamA(peekA);
        displayForTeamB(peekB);
    }
    public void displayForTeamA(int score) {

        TextView scoreView = (TextView) findViewById(R.id.scorecardA);
        scoreView.setText(String.valueOf(score));
        if (scoreA >0) {
            peekA = scoreA;
        }
    }
    public void displayForTeamB(int score) {

        TextView scoreView = (TextView) findViewById(R.id.scorecardB);
        scoreView.setText(String.valueOf(score));
        if (scoreB >0){
            peekB = scoreB;
        }

    }
}
