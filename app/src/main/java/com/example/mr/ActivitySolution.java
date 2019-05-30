package com.example.mr;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class ActivitySolution extends AppCompatActivity {
    public TextView x1,x2;
    public WebView sol;
    public Button Return;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solution);
           x1=findViewById(R.id.x1);
           x2=findViewById(R.id.x2);
           sol=findViewById(R.id.webview);
           Return=findViewById(R.id.button);

    }
    Intent gi= getIntent();
    double y1,y2;
    double a1= gi.getDoubleExtra("a1",0);
    double b1= gi.getDoubleExtra("b1",0);
    double c1= gi.getDoubleExtra("c1",0);

}
