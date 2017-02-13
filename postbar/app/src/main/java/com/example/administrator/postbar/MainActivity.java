package com.example.administrator.postbar;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button signinbt;
    private EditText user_name,password;
    private TextView register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user_name = (EditText)findViewById(R.id.editText);
        password = (EditText)findViewById(R.id.editText2);
        signinbt = (Button)findViewById(R.id.button);
        signinbt.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v){

            }
        }
    }
}
