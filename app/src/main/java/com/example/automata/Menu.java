package com.example.automata;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DownloadManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_menu);

        Button startJava=(Button)findViewById(R.id.btnJava);
        Button startHtml=(Button)findViewById(R.id.btnHtml);
        Button startPHP=(Button)findViewById(R.id.btnPHP);
        Button startPython=(Button)findViewById(R.id.btnPython);
        Button startQuery=(Button)findViewById(R.id.btnSend);

        final EditText nametext=(EditText)findViewById(R.id.editText);

        startJava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=nametext.getText().toString();
                Intent intent=new Intent(getApplicationContext(),Java.class);
                intent.putExtra("myname",name);
                startActivity(intent);
            }
        });

        startHtml.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=nametext.getText().toString();
                Intent intent=new Intent(getApplicationContext(),HTML.class);
                intent.putExtra("myname",name);
                startActivity(intent);
            }
        });

        startPHP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=nametext.getText().toString();
                Intent intent=new Intent(getApplicationContext(),PHP.class);
                intent.putExtra("myname",name);
                startActivity(intent);
            }
        });

        startPython.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=nametext.getText().toString();
                Intent intent=new Intent(getApplicationContext(),Python.class);
                intent.putExtra("myname",name);
                startActivity(intent);
            }
        });

        startQuery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=nametext.getText().toString();
                Intent intent=new Intent(getApplicationContext(),query.class);
                intent.putExtra("myname",name);
                startActivity(intent);
            }
        });
    }
}