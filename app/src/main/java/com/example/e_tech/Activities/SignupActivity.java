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

public class SignupActivity extends AppCompatActivity {

    EditText ed_fstname , ed_scndname, ed_email , ed_pass , ed_rpass ;
    Button btn_regist ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        ed_fstname= findViewById(R.id.fstname_edtxt);
        ed_scndname= findViewById(R.id.scnd_edtxt);
        ed_email = findViewById(R.id.email_edtxt);
        ed_pass = findViewById(R.id.pass_edtxt);
        ed_rpass = findViewById(R.id.pass2_edtxt);
        btn_regist = findViewById(R.id.signup);

        SharedPreferences file = getSharedPreferences("File", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = file.edit();

        btn_regist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editor.putString("email" , ed_email.getText().toString().trim());
                editor.putString("pass" , ed_pass.getText().toString().trim());
                editor.commit();
                Intent go = new Intent(SignupActivity.this, LoginActivity.class);
                startActivity(go);
            }
        });
    }
}
