package com.andrestan1995gmail.calculadorageometrica;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    private TextView total;
    private String c;
    private String aux;
    private Intent i;
    private Bundle b;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        total = (TextView) findViewById(R.id.txtCajaResultado);
        b = getIntent().getExtras();
        c = b.getString("res");
        aux = ""+c;
        total.setText(aux);
    }

    public void Volver (View v){
        this.finish();
    }

    public void Home (View v){
        i = new Intent(this, Principal.class);
        startActivity(i);
    }
}
