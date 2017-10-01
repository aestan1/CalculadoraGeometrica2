package com.andrestan1995gmail.calculadorageometrica;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cuadrado extends AppCompatActivity {
    private EditText lado;
    private Resources resources;
    private Intent i;
    private Bundle b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);
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

    public void areaCuadrado(View view){
        if(validar()) {
            setContentView(R.layout.activity_cuadrado);
            double l, a;
            l = Double.parseDouble(lado.getText().toString());
            a = (l * l);
            String nomb = "Area del cuadrado";
            String dat = "Lado:  " + l + " cm";
            String res = "" + a + " cm²";
            b.putString("res", res);
            i.putExtras(b);
            Operacion o = new Operacion(nomb, dat, res);
            o.guardar();
            startActivity(i);
        }
    }
}
