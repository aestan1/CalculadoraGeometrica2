package com.andrestan1995gmail.calculadorageometrica;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Esfera extends AppCompatActivity {
    private EditText radio;
    private Resources resources;
    private Intent i;
    private Bundle b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esfera);
        radio = (EditText)findViewById(R.id.txtRadio);
        resources = this.getResources();
        i = new Intent(this, Resultado.class);
        b = new Bundle();
    }
    public boolean validar(){
        if (radio.getText().toString().isEmpty()){
            radio.setError(resources.getString(R.string.error1));
            return  false;
        }

        if(Integer.parseInt(radio.getText().toString())<=0){
            radio.setError(resources.getString(R.string.error2));
            return false;
        }
        return true;
    }

    public void vEsfera(View view){

        if(validar()) {
            setContentView(R.layout.activity_esfera);
            double r, v;
            r = Double.parseDouble(radio.getText().toString());
            v = (4 / 3) * 3.1416 * (Math.pow(r, 3));
            String nomb = "Volumen de la esfera";
            String dat = "Radio: " + r + " cm";
            String res = "" + v + " cm³";
            b.putString("res", res);
            i.putExtras(b);
            Operacion o = new Operacion(nomb, dat, res);
            o.guardar();
            startActivity(i);
        }
    }
}
