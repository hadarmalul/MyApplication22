package com.example.user.myapplication22;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4;
    TextView txt1, txt2, txt3;
    int x,y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        txt1 = (TextView) findViewById(R.id.txt1);
        txt2 = (TextView) findViewById(R.id.txt2);
        txt3 = (TextView) findViewById(R.id.txt3);


    }

    public void rdclick(View view) {
        Random rd = new Random();
        x = rd.nextInt(101);
        y = rd.nextInt(101);
        txt2.setText(""+ x);
        txt3.setText(""+ y);

    }

    public void sclick(View view) {
        if (x < y){
            txt1.setText("true");
            txt1.setTextColor(Color.GREEN);}
        else {
            txt1.setText("false");
            txt1.setTextColor(Color.RED); }
    }

    public void eclick(View view) {
        if (x == y) {
            txt1.setText("true");
            txt1.setTextColor(Color.GREEN);}
        else {
            txt1.setText("false");
            txt1.setTextColor(Color.RED); }
    }

    public void bclick(View view) {
        if (x > y) {
            txt1.setText("true");
            txt1.setTextColor(Color.GREEN);}
        else {
            txt1.setText("false");
            txt1.setTextColor(Color.RED); }
    }
}



