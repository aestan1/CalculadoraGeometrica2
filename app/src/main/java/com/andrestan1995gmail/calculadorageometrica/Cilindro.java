package com.andrestan1995gmail.calculadorageometrica;


import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Cilindro extends AppCompatActivity {

    private EditText radio, altura;
    private Intent i;
    private Bundle b;
    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cilindro);
        radio = (EditText) findViewById(R.id.txtRadio);
        altura = (EditText) findViewById(R.id.txtAltura);
        resources = this.getResources();
        i = new Intent(this, Resultado.class);
        b = new Bundle();
    }

    public boolean validar() {
        if (radio.getText().toString().isEmpty()) {
            radio.setError(resources.getString(R.string.error1));
            return false;
        }
        if (altura.getText().toString().isEmpty()) {
            altura.setError(resources.getString(R.string.error1));
            return false;
        }
        if (Integer.parseInt(radio.getText().toString()) <= 0) {
            radio.setError(resources.getString(R.string.error2));
            return false;
        }
        if (Integer.parseInt(altura.getText().toString()) <= 0) {
            altura.setError(resources.getString(R.string.error2));
            return false;
        }

        return true;
    }

    public void volumenCilindro(View v) {
        if (validar()) {
            double r, h, vol;
            r = Double.parseDouble(radio.getText().toString());
            h = Double.parseDouble(altura.getText().toString());
            setContentView(R.layout.activity_cilindro);
            vol = ((3.1416 * Math.pow(r, 2)) * h);
            String nomb = "Volumen del cilindro";
            String dat = "Radio: " + r + " cm\nAltura: " + h + " cm";
            String res = "" + vol + " cm³";

            //Toast.makeText(this, resources.getString(R.string.mensaje_exitoso), Toast.LENGTH_SHORT).show();
            b.putString("res", res);
            i.putExtras(b);
            Operacion o = new Operacion(nomb, dat, res);
            o.guardar();
            startActivity(i);


        }
    }
}
