package com.example.helpv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button button;
    EditText pas,usr;

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRegistration();
            }
        });
        usr=(EditText)findViewById(R.id.editText);
        pas=(EditText)findViewById(R.id.editText2);
    }
    public void openRegistration(){
        Intent intent=new Intent(this,Registration.class);
        startActivity(intent);

    }
    public void LoginBtn(View view){
        String user=usr.getText().toString();
        String pass=pas.getText().toString();



    }
}
