package com.example.colores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RadioButton rbMorado,rbAzul,rbRojo,rbVerde,rbAmarillo,rbNaranja,rbDorado,rbCeleste,rbNegro,rbMarron;
    private TextView tvColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rbMorado = (RadioButton) findViewById(R.id.rbtMorado);
        rbAzul = (RadioButton) findViewById(R.id.rbtAzul);
        rbRojo = (RadioButton) findViewById(R.id.rbtRojo);
        rbVerde = (RadioButton) findViewById(R.id.rbtVerde);
        rbAmarillo = (RadioButton) findViewById(R.id.rbtAmarillo);
        rbNaranja = (RadioButton) findViewById(R.id.rbtNaranja);
        rbDorado = (RadioButton) findViewById(R.id.rbtDorado);
        rbCeleste = (RadioButton) findViewById(R.id.rbtCeleste);
        rbNegro = (RadioButton) findViewById(R.id.rbtNegro);
        rbMarron = (RadioButton) findViewById(R.id.rbtMarron);
        tvColor = (TextView) findViewById(R.id.txtColor);
    }
    public void Color(View view)
    {
        if(rbMorado.isChecked()==true)
        {
            tvColor.setText("El color seleccionado es el morado");
        }
        else if(rbAzul.isChecked()==true)
        {
            tvColor.setText("El color seleccionado es el azul");
        }
        else if(rbRojo.isChecked()==true)
        {
            tvColor.setText("El color seleccionado es el rojo");
        }
        else if(rbVerde.isChecked()==true)
        {
            tvColor.setText("El color seleccionado es el verde");
        }
        else if(rbAmarillo.isChecked()==true)
        {
            tvColor.setText("El color seleccionado es el amarillo");
        }
        else if(rbNaranja.isChecked()==true)
        {
            tvColor.setText("El color seleccionado es el naranja");
        }
        else if(rbDorado.isChecked()==true)
        {
            tvColor.setText("El color seleccionado es el dorado");
        }
        else if(rbCeleste.isChecked()==true)
        {
            tvColor.setText("El color seleccionado es el celeste");
        }
        else if(rbNegro.isChecked()==true)
        {
            tvColor.setText("El color seleccionado es el negro");
        }
        else if(rbMarron.isChecked()==true)
        {
            tvColor.setText("El color seleccionado es el marron");
        }
    }

}