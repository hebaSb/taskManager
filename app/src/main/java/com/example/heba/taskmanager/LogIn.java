package com.example.heba.taskmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LogIn extends AppCompatActivity {
    EditText editTextMail;
    EditText editTextPass;
    TextView textViewPass;
    Button buttonSingIn;
    EditText editTextLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        editTextLogin=(EditText)findViewById(R.id.editTextLogin);
        editTextMail=(EditText)findViewById(R.id.mailEditText);
        editTextPass=(EditText)findViewById(R.id.passwordEditText);
        textViewPass=(TextView)findViewById(R.id.passwordTextView);
        buttonSingIn=(Button)findViewById(R.id.signInButton);
        buttonSingIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),HomePage.class);
                startActivity(intent);
            }
        });



    }
}
