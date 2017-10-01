package com.andrestan1995gmail.calculadorageometrica;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Rectangulo extends AppCompatActivity {
    private EditText lado, lado2;
    private Resources resources;
    private Intent i;
    private Bundle b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);
        resources = this.getResources();
        lado = (EditText)findViewById(R.id.txtLado);
        lado2= (EditText)findViewById(R.id.txtLado2);
        i = new Intent(this, Resultado.class);
        b = new Bundle();
    }

    public boolean validar(){
        if (lado.getText().toString().isEmpty()){
            lado.setError(resources.getString(R.string.error1));
            return  false;
        }
        if(lado2.getText().toString().isEmpty()){
            lado2.setError(resources.getString(R.string.error1));
            return  false;
        }
        if(Integer.parseInt(lado.getText().toString())<=0){
            lado.setError(resources.getString(R.string.error2));
            return false;
        }
        if(Integer.parseInt(lado2.getText().toString())<=0){
            lado2.setError(resources.getString(R.string.error2));
            return false;
        }

        return true;
    }

    public void aRectangulo(View view) {
        if (validar()) {
            setContentView(R.layout.activity_rectangulo);
            double l, l2, a;
            l = Double.parseDouble(lado.getText().toString());
            l2 = Double.parseDouble(lado2.getText().toString());
            a = (l * l2);
            String nomb = "Area del rectangulo";
            String dat = "Lado:  " + l + " cm\nLado:  " + l2 + " cm";
            String res = "" + a + " cm²";
            b.putString("res", res);
            i.putExtras(b);
            Operacion o = new Operacion(nomb, dat, res);
            o.guardar();
            startActivity(i);
        }
    }

}
