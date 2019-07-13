package com.example.user.login;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.user.login.R.drawable.*;

public class MainActivity extends AppCompatActivity {

    EditText edt1, edt2;
    Button bt;
    TextView tx;
    private boolean doubleBackToExitPressedOnce = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = findViewById(R.id.ed1_id);
        edt2 = findViewById(R.id.ed2_id);
        bt = findViewById(R.id.bt_id);
        tx = findViewById(R.id.tx_id);

        tx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(i);
                finish();
            }
        });
        bt.setOnClickListener(new View.OnClickListener() {


            @TargetApi(Build.VERSION_CODES.M)
            @RequiresApi(api = Build.VERSION_CODES.M)
            @SuppressLint("ResourceAsColor")
            @Override
            public void onClick(View v) {
                String usr = "xyz";
                String pass = "12345";

                if (edt1.getText().toString().trim().equals(usr) && edt2.getText().toString().trim().equals(pass)) {

                    bt.setText("Login Success..!!");
                    bt.setTextColor(getColor(R.color.green));
                    Intent j=new Intent(MainActivity.this,ThirdActivity.class);
                    startActivity(j);
                    finish();


                } else {
                    bt.setText("Login fail..??");
                    bt.setTextColor(getColor(R.color.red));
                }

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
