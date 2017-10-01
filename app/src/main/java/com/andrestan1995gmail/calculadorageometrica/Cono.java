package com.andrestan1995gmail.calculadorageometrica;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cono extends AppCompatActivity {
    private EditText radio, altura;
    private Resources resources;
    private Intent i;
    private Bundle b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cono);
        radio = (EditText)findViewById(R.id.txtRadio);
        altura= (EditText)findViewById(R.id.txtAltura);
        resources = this.getResources();
        i = new Intent(this, Resultado.class);
        b = new Bundle();

    }

    public boolean validar(){
        if (radio.getText().toString().isEmpty()){
            radio.setError(resources.getString(R.string.error1));
            return  false;
        }
        if(altura.getText().toString().isEmpty()){
            altura.setError(resources.getString(R.string.error1));
            return  false;
        }
        if(Integer.parseInt(radio.getText().toString())<=0){
            radio.setError(resources.getString(R.string.error2));
            return false;
        }
        if(Integer.parseInt(altura.getText().toString())<=0){
            altura.setError(resources.getString(R.string.error2));
            return false;
        }

        return true;
    }

    public void vCono(View view) {
        if (validar()) {
            setContentView(R.layout.activity_cono);
            double r, h, v;
            r = Double.parseDouble(radio.getText().toString());
            h = Double.parseDouble(altura.getText().toString());
            v = (((3.1416 * Math.pow(r, 2)) * h) / 3);
            String nomb = "Volumen del cono";
            String dat = "Radio: " + r + " cm\nAltura: " + h + " cm";
            String res = "" + v + " cm³";
            b.putString("res", res);
            i.putExtras(b);
            Operacion o = new Operacion(nomb, dat, res);
            o.guardar();
            startActivity(i);
        }
    }
}
