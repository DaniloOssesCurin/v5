package com.example.crud_sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class procesos extends AppCompatActivity {
    Button siguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_procesos);

        siguiente=(Button)findViewById(R.id.button);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent( procesos.this, MapsActivity.class);
                startActivity(i);
            }
        });
        siguiente=(Button)findViewById(R.id.button3);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent( procesos.this, Gyroscope.class);
                startActivity(i);
            }
        });
    }
}