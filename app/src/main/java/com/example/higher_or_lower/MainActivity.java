package com.example.higher_or_lower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomnumber;

    public void generateRandomNumber() {
        Random rando = new Random();
        randomnumber = rando.nextInt(20) + 1 ;
    }
    public void guess(View view){
        String message;


        EditText number = (EditText) findViewById(R.id.editText);

        Log.i("num",number.getText().toString());

        Log.i("button",Integer.toString(randomnumber));

        int guessvalue = Integer.parseInt(number.getText().toString());

        if(guessvalue>randomnumber){
            message= "lower";
        }


        else if (guessvalue<randomnumber){
            message= "higher";
        }


        else {
            message="your got the number";
            generateRandomNumber();
        }
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         generateRandomNumber();

    }
}
