package com.andrestan1995gmail.calculadorageometrica;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cubo extends AppCompatActivity {
    private EditText lado;
    private Intent i;
    private Bundle b;
    private Resources resources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubo);
        lado = (EditText)findViewById(R.id.txtLado);
        resources = this.getResources();
        i = new Intent(this, Resultado.class);
        b = new Bundle();
    }
    public boolean validar(){
        if (lado.getText().toString().isEmpty()){
            lado.setError(resources.getString(R.string.error1));
            return  false;
        }
        if(Integer.parseInt(lado.getText().toString())<=0){
            lado.setError(resources.getString(R.string.error2));
            return false;
        }
        return true;
    }

    public void vCubo(View view) {

        if (validar()) {
            setContentView(R.layout.activity_cubo);
            double l, v;
            l = Double.parseDouble(lado.getText().toString());
            v = Math.pow(l, 3);
            String nomb = "Volumen del cubo";
            String dat = "Lado:  " + l + " cm";
            String res = "" + v + " cm³";
            b.putString("res", res);
            i.putExtras(b);
            Operacion o = new Operacion(nomb, dat, res);
            o.guardar();
            startActivity(i);
        }
    }
}
