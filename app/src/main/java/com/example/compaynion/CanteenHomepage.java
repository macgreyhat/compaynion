package com.example.compaynion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CanteenHomepage extends AppCompatActivity {

    private Button submit1;
    private Button scan;
    private Button cBackLogin;
    public Button cmanage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canteen_homepage);

        submit1=(Button) findViewById(R.id.submitCanteenrollnum);
        scan=(Button) findViewById(R.id.cScannerButton);
        cBackLogin=(Button) findViewById(R.id.backCanteenlogin);
        cmanage=(Button) findViewById(R.id.canteen_manage);

        //intent to open canteen transactions on click of button
        submit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(CanteenHomepage.this,CanteenTransaction.class);
                startActivity(i2);
            }
        });


        //intent to open scanner
        scan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(CanteenHomepage.this,Scanner.class);
                startActivity(i3);
            }
        });

        //intent to go back to login
        cBackLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(CanteenHomepage.this,CanteenLogin.class);
                startActivity(i4);
            }
        });

        cmanage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5 = new Intent(CanteenHomepage.this,canteen_manage.class);
                startActivity(i5);
            }
        });

    }
}