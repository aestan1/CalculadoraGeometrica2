package com.andrestan1995gmail.calculadorageometrica;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Estan on 23/09/2017.
 */

public class Metodos extends AppCompatActivity {
    //private EditText radio, lado, lado2, base, altura;

    private EditText radio, altura;


    private Resources resources;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       /* lado = (EditText)findViewById(R.id.txtLado);
        lado2= (EditText)findViewById(R.id.txtLado2);
        base= (EditText)findViewById(R.id.txtBase);*/

        //setContentView(R.layout.activity_cilindro);
        radio = (EditText)findViewById(R.id.txtRadio);
        altura= (EditText)findViewById(R.id.txtAltura);
        resources = this.getResources();
    }

    /*public void aCirculo(View view){
        resources = this.getResources();
        setContentView(R.layout.activity_circulo);
        double r, a;
        r = Double.parseDouble(radio.getText().toString());
        a= ((2*2.1416)*(Math.pow(r,2)));
        String nomb ="Area del circulo";
        String dat="Radio: "+r;
        String res=""+a;
        Operacion o = new Operacion(nomb,dat,res);
        o.guardar();

        Toast.makeText(this,resources.getString(R.string.mensaje_exitoso),Toast.LENGTH_SHORT).show();

    }



    public void aCuadrado(View view){
        setContentView(R.layout.activity_cuadrado);
        double l, a;
        l = Double.parseDouble(lado.getText().toString());
        a= (Math.pow(l,2));
        String nomb ="Area del cuadrado";
        String dat="Lado:"+l;
        String res=""+a;
        Operacion o = new Operacion(nomb,dat,res);
        o.guardar();

        Toast.makeText(this,resources.getString(R.string.mensaje_exitoso),Toast.LENGTH_SHORT).show();

    }

    public void aRectangulo(View view){
        setContentView(R.layout.activity_rectangulo);
        double l, l2, a ;
        l = Double.parseDouble(lado.getText().toString());
        l2=Double.parseDouble(lado2.getText().toString());
        a= (l*l2);
        String nomb ="Area del rectangulo";
        String dat="Lado:"+l+" \nLado:"+l2;
        String res=""+a;
        Operacion o = new Operacion(nomb,dat,res);
        o.guardar();
        Toast.makeText(this,resources.getString(R.string.mensaje_exitoso),Toast.LENGTH_SHORT).show();
    }

    public void aTriangulo(View view){
        setContentView(R.layout.activity_triangulo);

        double b, h, a;
        b = Double.parseDouble(base.getText().toString());
        h = Double.parseDouble(altura.getText().toString());
        a= ((b*h)/2);
        String nomb ="Area del triangulo";
        String dat="Base:"+b+"\nAltura:"+h;
        String res=""+a;
        Operacion o = new Operacion(nomb,dat,res);
        o.guardar();
        Toast.makeText(this,resources.getString(R.string.mensaje_exitoso),Toast.LENGTH_SHORT).show();

    }
    */

    public void volCilindro(View view){

        double r, h, v;
        r = Double.parseDouble(radio.getText().toString());
        h = Double.parseDouble(altura.getText().toString());
        v= ((3.1416*Math.pow(r,2))*h);
        String nomb ="Volumen del cilindro";
        String dat="Radio:"+r+"\nAltura:"+h;
        String res=""+v;
        Operacion o = new Operacion(nomb,dat,res);
        o.guardar();
        Toast.makeText(this,resources.getString(R.string.mensaje_exitoso),Toast.LENGTH_SHORT).show();

    }
/*
    public void vCono(View view){
        setContentView(R.layout.activity_cono);
        double r, h, v;
        r = Double.parseDouble(radio.getText().toString());
        h = Double.parseDouble(altura.getText().toString());
        v= (((3.1416*Math.pow(r,2))*h)/3);
        String nomb ="Volumen del cono";
        String dat="Radio:"+r+"Altura:"+h;
        String res=""+v;
        Operacion o = new Operacion(nomb,dat,res);
        o.guardar();
        Toast.makeText(this,resources.getString(R.string.mensaje_exitoso),Toast.LENGTH_SHORT).show();

    }
    public void vCubo(View view){
        double l, v;
        l = Double.parseDouble(lado.getText().toString());
        v= Math.pow(l,3);
        String nomb ="Volumen del cubo";
        String dat="Lado:"+l;
        String res=""+v;
        Operacion o = new Operacion(nomb,dat,res);
        o.guardar();
        Toast.makeText(this,resources.getString(R.string.mensaje_exitoso),Toast.LENGTH_SHORT).show();

    }

    public void vEsfera(View view){
        setContentView(R.layout.activity_esfera);
        double r, v;
        r = Double.parseDouble(radio.getText().toString());
        v= (4/3)*3.1416*(Math.pow(r,3));
        String nomb ="Volumen de la esfera";
        String dat="Radio:"+r;
        String res=""+v;
        Operacion o = new Operacion(nomb,dat,res);
        o.guardar();
        Toast.makeText(this,resources.getString(R.string.mensaje_exitoso),Toast.LENGTH_SHORT).show();

    }*/


}
