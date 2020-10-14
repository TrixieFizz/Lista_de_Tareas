package com.astorga.listadetareas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spinner_dias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner_dias = findViewById(R.id.spinner_Dias);

        ArrayAdapter<CharSequence> adaptador = ArrayAdapter.createFromResource(MainActivity.this,R.array.dias_array,
                android.R.layout.simple_spinner_item);

        spinner_dias.setAdapter(adaptador);
    }
}