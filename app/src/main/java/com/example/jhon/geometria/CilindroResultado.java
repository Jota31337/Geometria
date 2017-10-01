package com.example.jhon.geometria;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Jhon on 1/10/2017.
 */

public class CilindroResultado extends AppCompatActivity {
    private Resources resources;
    private Intent in;
    private TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cilindro_resultado);
        resources = this.getResources();
        res= (TextView) findViewById(R.id.txtResultadoVolumen);
        Bundle datos = this.getIntent().getExtras();
        double val = datos.getDouble("VolumenCilindro");
        res.setText(""+val);


    }

    public void regresar(View view){
        in= new Intent(CilindroResultado.this,Cilindro.class);
        startActivity(in);
    }
}