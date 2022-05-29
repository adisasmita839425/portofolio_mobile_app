package com.example.tekatekisulit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class bermain_level1 extends AppCompatActivity {

    Button cek;
    ConstraintLayout constraintsatu;
    ImageView returnsalah, returnbenar, nyawa3;
    EditText a,b,c,d,e,f,g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bermain_level1);

        cek = (Button)findViewById(R.id.cek);
        constraintsatu = (ConstraintLayout)findViewById(R.id.constraintsatu);
        returnbenar = (ImageView)findViewById(R.id.returnbenar);
        returnsalah = (ImageView)findViewById(R.id.returnsalah);
        nyawa3 = (ImageView)findViewById(R.id.nyawa3);

        a = (EditText)findViewById(R.id.a);
        b = (EditText)findViewById(R.id.b);
        c = (EditText)findViewById(R.id.c);
        d = (EditText)findViewById(R.id.d);
        e = (EditText)findViewById(R.id.e);
        f = (EditText)findViewById(R.id.f);
        g = (EditText)findViewById(R.id.g);

        constraintsatu.setVisibility(View.INVISIBLE);
        returnsalah.setVisibility(View.INVISIBLE);
        returnbenar.setVisibility(View.INVISIBLE);

        cek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ja,jb,jc,jd,je,jf,jg;

                ja = a.getText().toString();
                jb = b.getText().toString();
                jc = c.getText().toString();
                jd = d.getText().toString();
                je = e.getText().toString();
                jf = f.getText().toString();
                jg = g.getText().toString();

                constraintsatu.setVisibility(View.VISIBLE);
                if(ja.equals("J") && jb.equals("A") && jc.equals("K") && jd.equals("A") && je.equals("R") && jf.equals("T") && jg.equals("A")){
                    InputMethodManager inputMethodManager = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                    inputMethodManager.hideSoftInputFromWindow(v.getApplicationWindowToken(),0);
                    returnbenar.setVisibility(View.VISIBLE);
                }else{
                    InputMethodManager inputMethodManager = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
                    inputMethodManager.hideSoftInputFromWindow(v.getApplicationWindowToken(),0);
                    nyawa3.setVisibility(View.INVISIBLE);
                    returnsalah.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}