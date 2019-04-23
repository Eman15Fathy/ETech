package com.example.e_tech.Activities;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.e_tech.R;

public class NewPassActivity extends AppCompatActivity {

    EditText ed_newpass , ed_newpass2;
    Button btn_done;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_pass);


        ed_newpass= findViewById(R.id.newpass_edtxt);
        ed_newpass2= findViewById(R.id.newpass2_edtxt);
        btn_done = findViewById(R.id.btn_done);

        SharedPreferences file = getSharedPreferences("File", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = file.edit();

        btn_done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("pass" , ed_newpass.getText().toString());
                editor.apply();
                Intent go = new Intent(NewPassActivity.this, LoginActivity.class);
                startActivity(go);
            }
        });
    }

    }

