package com.example.mahit.codds12rules;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        b9=(Button)findViewById(R.id.button9);
        b10=(Button)findViewById(R.id.button10);
        b11=(Button)findViewById(R.id.button11);
        b12=(Button)findViewById(R.id.button12);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchbtn1();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchbtn2();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchbtn3();
            }
        });


        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchbtn4();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchbtn5();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchbtn6();
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchbtn7();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchbtn8();
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchbtn9();
            }
        });

        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchbtn10();
            }
        });

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchbtn11();
            }
        });

        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                launchbtn12();
            }
        });
    }

    private void launchbtn1(){
        Intent intent = new Intent(this,btn1.class);
        startActivity(intent);
    }
    private void launchbtn2(){
        Intent intent = new Intent(this,btn2.class);
        startActivity(intent);
    }
    private void launchbtn3(){
        Intent intent = new Intent(this,btn3.class);
        startActivity(intent);
    }
    private void launchbtn4(){
        Intent intent = new Intent(this,btn4.class);
        startActivity(intent);
    }
    private void launchbtn5(){
        Intent intent = new Intent(this,btn5.class);
        startActivity(intent);
    }
    private void launchbtn6(){
        Intent intent = new Intent(this,btn6.class);
        startActivity(intent);
    }
    private void launchbtn7(){
        Intent intent = new Intent(this,btn7.class);
        startActivity(intent);
    }
    private void launchbtn8(){
        Intent intent = new Intent(this,btn8.class);
        startActivity(intent);
    }
    private void launchbtn9(){
        Intent intent = new Intent(this,btn9.class);
        startActivity(intent);
    }
    private void launchbtn10(){
        Intent intent = new Intent(this,btn10.class);
        startActivity(intent);
    }
    private void launchbtn11(){
        Intent intent = new Intent(this,btn11.class);
        startActivity(intent);
    }
    private void launchbtn12(){
        Intent intent = new Intent(this,btn12.class);
        startActivity(intent);
    }
}
