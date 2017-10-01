package com.andrestan1995gmail.calculadorageometrica;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Triangulo extends AppCompatActivity {
    private Resources resources;
    private EditText altura, base;
    private Intent i;
    private Bundle b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangulo);
        base = (EditText)findViewById(R.id.txtBase);
        altura = (EditText)findViewById(R.id.txtAltura);
        resources = this.getResources();
        i = new Intent(this, Resultado.class);
        b = new Bundle();
    }

    public boolean validar(){
        if (base.getText().toString().isEmpty()){
            base.setError(resources.getString(R.string.error1));
            return  false;
        }
        if(altura.getText().toString().isEmpty()){
            altura.setError(resources.getString(R.string.error1));
            return  false;
        }
        if(Integer.parseInt(base.getText().toString())<=0){
            base.setError(resources.getString(R.string.error2));
            return false;
        }
        if(Integer.parseInt(altura.getText().toString())<=0){
            altura.setError(resources.getString(R.string.error2));
            return false;
        }

        return true;
    }

    public void aTriangulo(View view){
        if(validar()) {
            setContentView(R.layout.activity_triangulo);
            double ba, h, a;
            ba = Double.parseDouble(base.getText().toString());
            h = Double.parseDouble(altura.getText().toString());
            a = ((ba * h) / 2);
            String nomb = "Area del triangulo";
            String dat = "Base:  " + ba + " cm\nAltura: " + h + " cm";
            String res = "" + a + " cm²";
            //Toast.makeText(this, resources.getString(R.string.mensaje_exitoso), Toast.LENGTH_SHORT).show();
            b.putString("res", res);
            i.putExtras(b);
            Operacion o = new Operacion(nomb, dat, res);
            o.guardar();
            startActivity(i);
        }
    }
}
