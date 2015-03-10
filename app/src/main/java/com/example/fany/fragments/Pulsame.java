package com.example.fany.fragments;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class Pulsame extends ActionBarActivity {


    int numVeces;
    Button btnPulsame;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pulsame);
        btnPulsame = (Button)findViewById(R.id.button6);
        numVeces = 0;
        if (savedInstanceState != null){
            numVeces = savedInstanceState.getInt("NumVeces",0);
            btnPulsame.setText("Pulsado "+numVeces+" veces");


        }
        btnPulsame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numVeces++;
                btnPulsame.setText("Pulsado "+numVeces+" veces");

            }
        });

    }
    @Override
    public void onSaveInstanceState(Bundle outInstance){
        outInstance.putInt("NumVeces", numVeces);
        super.onSaveInstanceState(outInstance);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pulsame, menu);
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
