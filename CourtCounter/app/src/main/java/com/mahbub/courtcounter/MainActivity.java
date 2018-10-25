package com.mahbub.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Tracks score for Team A
    int scoreTeamA = 0;

    // Tracks score for Team B
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayForTeamA(scoreTeamA);
    }

    /**
     * Adds 3 scoreTeamA to the score
     */
    public void addThreePoint(View view) {

        if (scoreTeamA < 1) {
            scoreTeamA = 3;
        } else {
            scoreTeamA = scoreTeamA + 3;
        }

        displayForTeamA(scoreTeamA);
    }

    /**
     * Adds 3 scoreTeamA to the score
     */
    public void addTwoPoint(View view) {


        if (scoreTeamA < 1) {
            scoreTeamA = 2;
        } else {
            scoreTeamA = scoreTeamA + 2;
        }

        displayForTeamA(scoreTeamA);
    }

    /**
     * Adds 3 scoreTeamA to the score
     */
    public void addFreePoint(View view) {


        if (scoreTeamA < 1) {
            scoreTeamA = 1;
        } else {
            scoreTeamA = scoreTeamA + 1;
        }

        displayForTeamA(scoreTeamA);
    }

    /**
     * Adds 3 scoreTeamB to the score
     */
    public void addThreePointB(View view) {

        if (scoreTeamB < 1) {
            scoreTeamB = 3;
        } else {
            scoreTeamB = scoreTeamB + 3;
        }

        displayForTeamB(scoreTeamB);
    }

    /**
     * Adds 3 scoreTeamB to the score
     */
    public void addTwoPointB(View view) {


        if (scoreTeamB < 1) {
            scoreTeamB = 2;
        } else {
            scoreTeamB = scoreTeamB + 2;
        }

        displayForTeamB(scoreTeamB);
    }

    /**
     * Adds 3 scoreTeamB to the score
     */
    public void addFreePointB(View view) {


        if (scoreTeamB < 1) {
            scoreTeamB = 1;
        } else {
            scoreTeamB = scoreTeamB + 1;
        }

        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resets the score to its initial value
     */
    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
