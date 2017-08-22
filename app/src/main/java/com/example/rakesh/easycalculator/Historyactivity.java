package com.example.rakesh.easycalculator;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.rakesh.easycalculator.R.id.historyid;

/**
 * Created by Rakesh on 8/20/2017.
 */

public class Historyactivity extends AppCompatActivity {
    TextView showhistory;;
    //Button resetbtn;
    String str1;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);
        str1 = getIntent().getStringExtra("historystr");
       // Toast.makeText(this.getBaseContext(), str1,Toast.LENGTH_LONG).show();
        showhistory= (TextView) findViewById(historyid);
        showhistory.setText(str1);
       /* resetbtn = (Button) findViewById(R.id.reset);
        resetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str1="";
                showhistory.setText("");
            }
        });*/


    }
}
