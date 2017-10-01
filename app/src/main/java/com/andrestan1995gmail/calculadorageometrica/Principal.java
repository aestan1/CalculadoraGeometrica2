package com.andrestan1995gmail.calculadorageometrica;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Principal extends AppCompatActivity {

    private ListView lv;
    private Resources resources;
    private String opc[];
    private Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        lv = (ListView)findViewById(R.id.lvOpciones);
        resources = this.getResources();
        opc = resources.getStringArray(R.array.OpcionesPrincipal);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,opc);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        in = new Intent(Principal.this,Areas.class);
                        startActivity(in);
                        break;
                    case 1:
                        in = new Intent(Principal.this,Volumen.class);
                        startActivity(in);
                        break;
                    case 2:
                        in = new Intent(Principal.this,Realizadas.class);
                        startActivity(in);
                        break;
                }
            }
        });
    }
}
