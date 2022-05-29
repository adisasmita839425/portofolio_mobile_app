package com.example.tekatekisulit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button peraturan_game, permainan_baru, batal_bermain, permainan_barujuga, lanjutkan_bermain;
    ConstraintLayout constraintsatu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        peraturan_game = (Button)findViewById(R.id.peraturan_game);
        permainan_baru = (Button)findViewById(R.id.permainan_baru);
        permainan_barujuga = (Button)findViewById(R.id.permain_barujuga);
        batal_bermain = (Button)findViewById(R.id.batal_bermain);
        lanjutkan_bermain = (Button)findViewById(R.id.lanjutkan_bermain);
        constraintsatu = (ConstraintLayout)findViewById(R.id.constraintsatu);

        constraintsatu.setVisibility(View.INVISIBLE);


        batal_bermain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                constraintsatu.setVisibility(View.INVISIBLE);
            }
        });
        peraturan_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Peraturan_permainan.class);
                startActivity(intent);
            }
        });

        lanjutkan_bermain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Boolean status_permainan = false;
                if(status_permainan){
                    Intent intent = new Intent(MainActivity.this, Permainan_baru.class);
                    startActivity(intent);
                }else{
                    constraintsatu.setVisibility(View.VISIBLE);
                }
            }
        });

        permainan_baru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Permainan_baru.class);
                startActivity(intent);
            }
        });

        permainan_barujuga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Permainan_baru.class);
                startActivity(intent);
            }
        });
    }
}