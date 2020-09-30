package com.example.gamepuzzlerahmi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final Button btn = findViewById(R.id.button) ;
       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               //aksi menekan tombol
           }
       });

    }
}
