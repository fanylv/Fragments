package com.example.fany.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Intents_Act_03 extends ActionBarActivity {

    Button btn;
    Intent i;
    Bundle b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents__act_03);
        btn = (Button)findViewById(R.id.button4);
        i = new Intent(Intents_Act_03.this,Intents_Act_03_b.class);
        b = new Bundle();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i.putExtra("str1", "Esto es un String");
                i.putExtra("num1", 25);
                b.putString("str2", "Esto es otro String");
                b.putInt("num2", 35);
                i.putExtras(b);
                startActivityForResult(i, 3);
            }
        });
    }
    public void onActivityResult(int requestCode, int resultCode, Intent data){
        if(resultCode == RESULT_OK && requestCode==3){
            Toast.makeText(this, data.getData().toString(), Toast.LENGTH_LONG).show();
            Toast.makeText(this, Integer.toString(data.getIntExtra("num3", 1)), Toast.LENGTH_LONG).show();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_intents__act_03, menu);
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
