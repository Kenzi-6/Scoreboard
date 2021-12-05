package com.example.football;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Integer score_1 = 0;
    private Integer score_2 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("Score1", score_1);
        outState.putInt("Score2", score_2);
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        score_1 = savedInstanceState.getInt("Score1");
        score_2 = savedInstanceState.getInt("Score2");
    }
    @SuppressLint("SetTextI18n")
    public void onClickBtnAddScore1(View view) {
        score_1++;
        TextView score1View = (TextView)findViewById(R.id.txt_score1);
        score1View.setText(score_1.toString());
    }
    @SuppressLint("SetTextI18n")
    public void onClickBtnAddScore2(View view) {
        score_2++;
        TextView score2View = (TextView)findViewById(R.id.txt_score2);
        score2View.setText(score_2.toString());
    }
    @SuppressLint("SetTextI18n")
    public void onClickBtnReset(View view) {
        score_1 = 0;
        score_2 = 0;
        TextView score1View = (TextView)findViewById(R.id.txt_score1);
        score1View.setText(score_1.toString());
        TextView score2View = (TextView)findViewById(R.id.txt_score2);
        score2View.setText(score_2.toString());
    }
}