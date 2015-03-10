package com.example.fany.fragments;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class CicloDeVida extends ActionBarActivity {


    public String TAG = "ciclodevida";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciclo_de_vida);
    }

    public void onStart(){
        super.onStart();
        android.util.Log.i(TAG,"onCreate");
    }

    public void onResume(){
        super.onResume();
        android.util.Log.i(TAG,"onResume");

    }
    public void onStop(){
        super.onStop();
        android.util.Log.i(TAG,"onStop");

    }
    public void onDestroy(){
        super.onDestroy();
        android.util.Log.i(TAG,"onDestroy");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ciclo_de_vida, menu);
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

