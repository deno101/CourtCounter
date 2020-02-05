package com.dnz.local.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView scoreTeamA, scoreTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        init textview scores
        scoreTeamA = findViewById(R.id.team_a);
        scoreTeamB = findViewById(R.id.team_b);
    }


    public void Plus3(View view){
        int current = getA();
        current += 3;
        displayA(Integer.toString(current));
    }

    public void Plus2(View view){
        int current = getA();
        current += 2;
        displayA(Integer.toString(current));
    }

    public void FreeThrow(View view){
        int current = getA();
        current += 1;
        displayA(Integer.toString(current));
    }

    public void Plus3B(View view){
        int current = getB();
        current += 3;
        displayB(Integer.toString(current));
    }

    public void Plus2B(View view){
        int current = getB();
        current += 2;
        displayB(Integer.toString(current));
    }

    public void FreeThrowB(View view){
        int current = getB();
        current += 1;
        displayB(Integer.toString(current));
    }

    public int getA(){
        String s = (String) scoreTeamA.getText();
        int z = Integer.parseInt(s);
        return z;
    }

    public int getB(){
        String s = (String) scoreTeamB.getText();
        int z = Integer.parseInt(s);
        return z;
    }


    public void displayA(String val){
        scoreTeamA.setText(val);
    }

    public void displayB(String val){
        scoreTeamB.setText(val);
    }

    public void reset(View view){
        scoreTeamB.setText("0");
        scoreTeamA.setText("0");
    }
}
