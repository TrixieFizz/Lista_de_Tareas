package com.astorga.listadetareas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    Spinner spinner_dias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner_dias = findViewById(R.id.spinner_Dias);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento = new Intent(MainActivity.this, AnadirTarea.class);
                startActivity(intento);
            }
        });

        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(MainActivity.this,R.array.dias_array,
                android.R.layout.simple_spinner_item);

        spinner_dias.setAdapter(adaptador);
    }
}