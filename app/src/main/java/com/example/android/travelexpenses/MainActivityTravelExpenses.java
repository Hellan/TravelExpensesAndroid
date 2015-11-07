package com.example.android.travelexpenses;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.text.DecimalFormat;


public class MainActivityTravelExpenses extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_travel_expenses);

        final EditText distance;
        final EditText pPL;
        final EditText price;
        final TextView result;
        final ImageButton button;
        button = (ImageButton) findViewById(R.id.button);
        pPL = (EditText) findViewById(R.id.kPL);
        distance = (EditText) findViewById(R.id.distance);
        price = (EditText) findViewById(R.id.price);
        result = (TextView) findViewById(R.id.result);


        View.OnClickListener listener = new View.OnClickListener(){
            public void onClick(View view) {
                double expense = (Double.parseDouble(distance.getText().toString()) / (Double.parseDouble(pPL.getText().toString())) * Double.parseDouble(price.getText().toString()));
                DecimalFormat df = new DecimalFormat("###.##");
                result.setText(df.format(expense));
            }
        };
        button.setOnClickListener(listener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity_travel_expenses, menu);
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
