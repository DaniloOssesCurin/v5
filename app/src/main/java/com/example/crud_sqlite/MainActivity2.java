package com.example.crud_sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
        EditText etEnviar;
        Button Enviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        etEnviar=findViewById(R.id.editTextTextPersonName);
        Enviar=findViewById(R.id.button2);


        Enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle enviadatos=new Bundle();
                enviadatos.putString("key",etEnviar.getText().toString());
                Intent i=new Intent( MainActivity2.this, MainActivity.class);
                i.putExtras(enviadatos);
                startActivity(i);
            }
        });
    }
}