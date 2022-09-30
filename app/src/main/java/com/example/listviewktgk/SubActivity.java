package com.example.listviewktgk;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SubActivity extends  AppCompatActivity{
    TextView txt_subphone;
    @Override
     protected void onCreate(Bundle.savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_sub);
            txt_subphone = findViewById(R.id.txt_subphone);
            Intent myintent = getIntent();
            String namephone  = myintent.getStrinExtra("name");
            txt_subphone.setText(namephone);
        }
    }
