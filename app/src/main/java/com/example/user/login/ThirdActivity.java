package com.example.user.login;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.Spinner;
        import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    Spinner sp1,sp2;
    Button bt;
    String sem[]={"1","2","3","4","5","6","7","8"};
    String branch[]={"Computer","IT","Mechanical","Electrical","Civil"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        sp1=(Spinner)findViewById(R.id.sp1_id);
        sp2=(Spinner)findViewById(R.id.sp2_id);
        bt=(Button)findViewById(R.id.bt_id);

        ArrayAdapter adp1=new ArrayAdapter(ThirdActivity.this,android.R.layout.simple_list_item_1,sem);
        sp1.setAdapter(adp1);
        ArrayAdapter adp2=new ArrayAdapter(ThirdActivity.this,android.R.layout.simple_list_item_1,branch);
        sp2.setAdapter(adp2);


        sp1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ThirdActivity.this, "Sem is "+sem[position], Toast.LENGTH_SHORT).show();
                //Toast.makeText(SecondActivity.this, "Branch is "+branch[position], Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        sp2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ThirdActivity.this, "Branch is "+branch[position], Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {


            }
        });
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ThirdActivity.this, "Back to home....", Toast.LENGTH_SHORT).show();
                Intent i=new Intent(ThirdActivity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
