package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView Fighter1View,Fighter2View;
    private Button Hit1Button, Hit2Button, Kick1Button, Kick2Button;
    private Fighters fighter1,fighter2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        fighter1 = new Fighters();
        fighter1.setHealth(1000);
        fighter1.setPower(40);
        fighter1.setAgility(120);
        fighter1.setDefence(80);
        fighter2 = new Fighters();
        fighter2.setHealth(1000);
        fighter2.setPower(60);
        fighter2.setAgility(80);
        fighter2.setDefence(40);
        update();


        Hit1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fighter1.hit(fighter2);
                update();
            }
        });

        Hit2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fighter2.hit(fighter1);
                update();
            }
        });

        Kick1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fighter1.kick(fighter2);
                update();
            }
        });

        Kick2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fighter2.kick(fighter1);
                update();
            }
        });
    }


    private void update() {
        Fighter1View.setText(String.valueOf(fighter1.getHealth()));
        Fighter2View.setText(String.valueOf(fighter2.getHealth()));
    }

    private void init() {
        Fighter1View = (TextView) findViewById(R.id.Fighter1View);
        Fighter2View = (TextView) findViewById(R.id.Fighter2View);
        Hit1Button = (Button) findViewById(R.id.Hit1Button);
        Hit2Button = (Button) findViewById(R.id.Hit2Button);
        Kick1Button = (Button) findViewById(R.id.Kick1Button);
        Kick2Button = (Button) findViewById(R.id.Kick2Button);
    }
}
