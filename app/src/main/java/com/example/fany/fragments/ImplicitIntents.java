package com.example.fany.fragments;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class ImplicitIntents extends ActionBarActivity {
    Button web;
    Button tlf;
    Button geo;
    Intent i,i2,i3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_intents);
        web = (Button)findViewById(R.id.button7);
        tlf = (Button)findViewById(R.id.button8);
        geo = (Button)findViewById(R.id.button9);
        i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.uem.es"));

        web.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(i);
            }
        });

        i2 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:+902232350"));

        tlf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(i2);
            }
        });

        i3 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://maps.google.com/maps?q=40.414422,-3.700933"));

        geo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(i3);
            }
        });



    }


    //@Override
    /*public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_implicit_intents, menu);
        return true;
    }*/

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

