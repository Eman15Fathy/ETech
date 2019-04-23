package com.example.e_tech.Activities;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.e_tech.Fragments.homeFragment;
import com.example.e_tech.R;

public class LoginActivity extends AppCompatActivity {

    String email , pass ;
    EditText ed_email ;
    EditText ed_pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        TextView tv_register = findViewById(R.id.forgetpass);
        Button btn_login = findViewById(R.id.btn_login);
        ed_email = findViewById(R.id.email_edtxt);
        ed_pass = findViewById(R.id.pass_edtxt);

        SharedPreferences file = getSharedPreferences( "File", Context.MODE_PRIVATE);


        email = file.getString("email", "eman") ;
        pass = file.getString("pass" , "123");


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email_edit = ed_email.getText().toString().trim();
                String pass_edit = ed_pass.getText().toString().trim() ;
                if(email_edit.equals(email) && pass_edit.equals(pass)) {

                    Intent go = new Intent(LoginActivity.this, MainActivity.class);

                    Bundle save = new Bundle();
                    save.putString("user", ed_email.getText().toString());

                    go.putExtras(save);
                    startActivity(go);

                }else{

                    Toast.makeText(LoginActivity.this,"Error in data " , Toast.LENGTH_LONG).show();
                }
            }
        });


        tv_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent go = new Intent (LoginActivity.this , ForgetPassActivity.class);
                startActivity(go);

            }
        });



            TextView signup_txt = findViewById(R.id.signup_txt);

                signup_txt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(LoginActivity.this , SignupActivity.class);
                    startActivity(intent);
                }
            });


                TextView textView= findViewById(R.id.skip);

                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Intent go = new Intent(LoginActivity.this, homeFragment.class);
startActivity(go);
                    }

    });
    }
}
