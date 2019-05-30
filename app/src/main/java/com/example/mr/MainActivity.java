package com.example.mr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public EditText a,b,c;
    String st;
    double a1,b1,c1;
    double x1,x2;
    TextView tv;
    public Button Ramdom ,Solution;
    public Random rnd= new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        a=findViewById(R.id.a);
        b=findViewById(R.id.b);
        c=findViewById(R.id.c);
        tv=findViewById(R.id.textView);
        setContentView(R.layout.activity_main);
        Intent int1=new Intent();
    }

    public void startsolution(View view) {
        st=a.getText().toString();
        a1= Double.parseDouble(st);
        st=c.getText().toString();
        c1= Double.parseDouble(st);
        st=b.getText().toString();
        b1= Double.parseDouble(st);
            if((Math.sqrt(b1*b1-4*a1*c1)<0)){
                tv.setText("Error the sqrt is negative");
        } else {
                x1 = (-b1 + ((Math.sqrt(b1 * b1 - 4 * a1 * c1) / 2 * a1)));
                x2 = (-b1 - (Math.sqrt(b1 * b1 - 4 * a1 * c1) / 2 * a1));
            }
    }

    public void RandomNum(View view) {
        a1=rnd.nextInt(100)+1;
        b1=rnd.nextInt(100)+1;
        c1=rnd.nextInt(100)+1;
        x1 = (-b1 + ((Math.sqrt(b1 * b1 - 4 * a1 * c1) / 2 * a1)));
        x2 = (-b1 - (Math.sqrt(b1 * b1 - 4 * a1 * c1) / 2 * a1));
    }
}
