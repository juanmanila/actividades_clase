package com.example.prueba4;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.support.v4.app.NavUtils;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    public void abrePantalla(View view){
   EditText caja=(EditText) findViewById(R.id.caja1);
   String contenido= caja.getText().toString();
   System.out.println("Contenido"+contenido);
    	Intent hi= new Intent(this, MainNuevaActivity.class);
    	startActivity(hi);
    	
    }
}
