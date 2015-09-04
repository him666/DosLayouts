package com.senbonzakura.marin.comactividades;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by DJ MARIN on 04/09/2015.
 */
public class HermanitoActividad2 extends Activity{
@Override
    protected void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_hermanito_actividad2);
    String mensajito = getIntent().getStringExtra("SendwL");
    Log.d(" una segunda actividad", mensajito);
}
}
