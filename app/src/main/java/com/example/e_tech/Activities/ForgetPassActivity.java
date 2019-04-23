package com.example.e_tech.Activities;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.e_tech.R;

public class ForgetPassActivity extends AppCompatActivity {

    String email ;
    EditText ed_email ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_pass);

        Button btn_send = findViewById(R.id.btn_send);
        ed_email = findViewById(R.id.email_edtxt);



        SharedPreferences file = getSharedPreferences( "File", Context.MODE_PRIVATE);


        email = file.getString("email", "opps") ;

        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed_email.getText().toString().equals(email)) {

                    Intent go = new Intent(ForgetPassActivity.this, NewPassActivity.class);

                    Bundle save = new Bundle();
                    save.putString("email", ed_email.getText().toString());

                    go.putExtras(save);
                    startActivity(go);

                }else{

                    Toast.makeText(ForgetPassActivity.this,"Email doesn't exist, Sign up please! " , Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
