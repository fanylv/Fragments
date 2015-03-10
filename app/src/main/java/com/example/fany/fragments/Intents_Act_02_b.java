package com.example.fany.fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Intents_Act_02_b extends ActionBarActivity {
    Button btn;
    Intent data;
    EditText texto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents__act_02_b);
        btn = (Button)findViewById(R.id.button3);
        data = new Intent();
        texto = (EditText)findViewById(R.id.editText);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data.setData(Uri.parse(texto.getText().toString()));
                setResult(RESULT_OK, data);
                finish();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_intents__act_02_b, menu);
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