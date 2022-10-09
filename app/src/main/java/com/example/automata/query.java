package com.example.automata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class query extends AppCompatActivity {

    EditText nametext;
    EditText emailtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query);

        Button sendQuery=(Button)findViewById(R.id.btnSends);

        nametext=(EditText)findViewById(R.id.editText);
        emailtext=(EditText)findViewById(R.id.emailText);

        sendQuery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Thank You, your reply will be through mail.", Toast.LENGTH_SHORT).show();
                emailtext.getText().clear();
                nametext.getText().clear();
            }
        });
    }
}