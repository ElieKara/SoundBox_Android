package com.example.karabogh.padoru;

import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridLayout;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {

    private Button padoru;
    private Button omae;
    private Button explosion;
    private Button bluffes;
    private Button ouf;
    private Button niconi;
    private Button fuck;
    private Button over9000;
    private Button tuturu;
    private Button victoire;
    private Button couilles;
    private MediaPlayer test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        padoru = (Button)  findViewById(R.id.padoru);
        omae = (Button) findViewById(R.id.omae);
        explosion = (Button)  findViewById(R.id.explosion);
        bluffes =(Button) findViewById(R.id.bluffes);
        ouf =(Button) findViewById(R.id.ouf);
        niconi =(Button) findViewById(R.id.niconi);
        fuck =(Button) findViewById(R.id.fuck);
        tuturu =(Button) findViewById(R.id.tuturu);
        over9000 =(Button) findViewById(R.id.over900);
        victoire =(Button) findViewById(R.id.victoire);
        couilles =(Button) findViewById(R.id.couilles);

        test = MediaPlayer.create(getApplicationContext(),R.raw.ouf);

        padoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test.stop();
                test = MediaPlayer.create(getApplicationContext(),R.raw.padoru);
                test.start();
            }
        });

        omae.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test.stop();
                test = MediaPlayer.create(getApplicationContext(),R.raw.omae);
                test.start();
            }
        });

        explosion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test.stop();
                test = MediaPlayer.create(getApplicationContext(),R.raw.explosion);
                test.start();
            }
        });

        bluffes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test.stop();
                test = MediaPlayer.create(getApplicationContext(),R.raw.bluffes);
                test.start();
            }
        });

        niconi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test.stop();
                test = MediaPlayer.create(getApplicationContext(),R.raw.niconi);
                test.start();
            }
        });

        tuturu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test.stop();
                test = MediaPlayer.create(getApplicationContext(),R.raw.tuturu);
                test.start();
            }
        });

        ouf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test = MediaPlayer.create(getApplicationContext(),R.raw.ouf);
                test.start();
            }
        });

        over9000.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test.stop();
                test = MediaPlayer.create(getApplicationContext(),R.raw.over9000);
                test.start();
            }
        });

        fuck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test.stop();
                test = MediaPlayer.create(getApplicationContext(),R.raw.fuck);
                test.start();
            }
        });

        victoire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test.stop();
                test = MediaPlayer.create(getApplicationContext(),R.raw.victory);
                test.start();
            }
        });

        couilles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                test.stop();
                test = MediaPlayer.create(getApplicationContext(),R.raw.couilles);
                test.start();
            }
        });
    }
}
