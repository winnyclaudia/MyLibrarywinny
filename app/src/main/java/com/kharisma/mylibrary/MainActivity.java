package com.kharisma.mylibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Users user;
    private Button tb_login;
    private EditText et_password,et_email;
    private String id = "id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tb_login = (Button) findViewById(R.id.tb_login);
        et_email = (EditText) findViewById(R.id.et_email);
        et_password = (EditText) findViewById(R.id.et_password);

        tb_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailkey= et_email.getText().toString();
                String passkey=et_password.getText().toString();

                user= new Users(emailkey);
                if(emailkey.equals(user.getEmail())&&passkey.equals(user.getPassword())){
                    Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this,DatauserActivity.class);
                    intent.putExtra(id,user.getEmail());
                    startActivity(intent);
                    et_email.setText(" ");
                    et_password.setText(" ");
                }

//                else if ((emailkey.matches("")||passkey.matches("")))
//                {
//                    Toast.makeText(getApplicationContext(),"Isikan Username dan Password", Toast.LENGTH_SHORT).show();
//                }
                else {
                    Toast.makeText(getApplicationContext(), "Login Gagal/Username Password Salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
