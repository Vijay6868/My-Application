package com.example.my_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void onBtnClick(View view){
        EditText edTxtName = findViewById(R.id.edTxtName);

        TextView txtHello = findViewById(R.id.txtMessage);

        txtHello.setText("Hello "+edTxtName.getText().toString());
    }
}