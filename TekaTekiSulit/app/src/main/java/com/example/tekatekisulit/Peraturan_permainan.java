package com.example.tekatekisulit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Peraturan_permainan extends AppCompatActivity {

    Button kembali_ke_permainan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peraturan_permainan);

        kembali_ke_permainan = (Button)findViewById(R.id.kembali_ke_permainan);
        kembali_ke_permainan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Peraturan_permainan.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}