package com.andrestan1995gmail.calculadorageometrica;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Circulo extends AppCompatActivity {
    private Resources resources;
    EditText radio;
    private Intent i;
    private Bundle b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circulo);
        radio = (EditText)findViewById(R.id.txtRadio);
        i = new Intent(this, Resultado.class);
        b = new Bundle();
        resources = this.getResources();

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

    public void aCirculo(View view){

        if(validar()) {
            setContentView(R.layout.activity_circulo);
            double r, a;
            r = Double.parseDouble(radio.getText().toString());
            a = ((2 * 3.1416) * (Math.pow(r, 2)));
            String nomb = "Area del circulo";
            String dat = "Radio: " + r + " cm";
            String res = "" + a + " cm²";
            b.putString("res", res);
            i.putExtras(b);
            Operacion o = new Operacion(nomb, dat, res);
            o.guardar();
            startActivity(i);

            //Toast.makeText(this, resources.getString(R.string.mensaje_exitoso), Toast.LENGTH_SHORT).show();
        }
    }
}
