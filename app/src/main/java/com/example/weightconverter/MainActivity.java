package com.example.weightconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


//region Toast Example
//    Context context = getApplicationContext();
//    CharSequence text = "Hello toast!";
//    int duration = Toast.LENGTH_SHORT;
//
//    Toast toast = Toast.makeText(context, text, duration);
//        toast.show();

    //endregion


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView tv_From = (TextView) findViewById(R.id.tv_from_usd);
        TextView tv_To = (TextView) findViewById(R.id.tv_to_VND);
        Button btn_Convert = (Button) findViewById(R.id.btn_convert);
        Button btn_cancel = (Button) findViewById(R.id.btn_clear);

        btn_Convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        tv_From.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch1to2(view);
            }
        });

        tv_To.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch1to2(view);
            }
        });

    }


    public void switch1to2(View view) {
        Intent switchActivityIntent = new Intent(this, MainActivity2.class);
        startActivity(switchActivityIntent);

    }


}