package com.example.tekatekisulit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Permainan_baru extends AppCompatActivity {
    Button bermain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permainan_baru);

        bermain = (Button)findViewById(R.id.bermain);
        bermain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Permainan_baru.this, bermain_level1.class);
                startActivity(intent);
            }
        });
    }
}