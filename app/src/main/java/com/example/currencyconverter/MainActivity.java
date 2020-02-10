package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {

        EditText myTextField = (EditText) findViewById(R.id.myTextField);
        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();

        String str = myTextField.getText().toString();
        //call go to activity2
        goToActivity2(str);

    }

    public void goToActivity2(String s) {

        //add an intent
        Intent intent = new Intent(this, Main2Activity.class);

        //helps pass data to second activity
        //pass string we want to output in the second activity
        intent.putExtra("message",s);

        startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
