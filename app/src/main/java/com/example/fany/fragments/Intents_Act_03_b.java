package com.example.fany.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Intents_Act_03_b extends ActionBarActivity {

    Intent i;
    Bundle b;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents__act_03_b);
        btn = (Button)findViewById(R.id.button5);
        String nombre;
        i = getIntent();
        b = i.getExtras();
        nombre = i.getStringExtra("str1");
        Toast.makeText(this, nombre,Toast.LENGTH_LONG).show();
        int numero;
        numero = i.getIntExtra("num1", 0);
        Toast.makeText(this, Integer.toString(numero), Toast.LENGTH_LONG).show();
        String apellido;
        apellido = b.getString("str2");
        Toast.makeText(this, apellido, Toast.LENGTH_LONG).show();
        int numero2;
        numero2 = b.getInt("num2");
        Toast.makeText(this, Integer.toString(numero2), Toast.LENGTH_LONG).show();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i.putExtra("num3", 45);
                i.setData(Uri.parse("Hola amigo!"));
                setResult(RESULT_OK,i);
                finish();

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_intents__act_03_b, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
