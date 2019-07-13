package com.example.user.login;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
    EditText edt1,edt2,edt3,edt4;
    Button btn;
    TextView tx;
    private boolean doubleBackToExitPressedOnce = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        edt1=findViewById(R.id.ed1_id);
        edt2=findViewById(R.id.ed2_id);
        edt3=findViewById(R.id.ed3_id);
        edt4=findViewById(R.id.ed4_id);
        btn=findViewById(R.id.bt_id);
        tx=findViewById(R.id.tx_id);

        tx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(SecondActivity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(SecondActivity.this, "Signup Successfull "+edt1.getText().toString().trim(), Toast.LENGTH_SHORT).show();

                Intent i=new Intent(SecondActivity.this,MainActivity.class);
                startActivity(i);
                finish();

            }
        });

    }
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Press 'back' again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 200000);
    }
}
