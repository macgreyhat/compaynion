package com.example.compaynion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StudentHomepage extends AppCompatActivity {
    private Button wB;
    private Button cB;
    private Button lB;
    private Button sBackLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_homepage);

        wB=(Button) findViewById(R.id.sWalletbutton);
        cB=(Button) findViewById(R.id.sCanteenbutton2);
        lB=(Button) findViewById(R.id.sLibrarybutton);
        //sBackLogin = (Button) findViewById(R.id.back_student_homepage);

        //intent to open wallet on click of button
        wB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(StudentHomepage.this,StudentWallet.class);
                startActivity(i1);
            }
        });

        //intent to open canteen transactions on click of button
        cB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(StudentHomepage.this,StudentCanteen.class);
                startActivity(i2);
            }
        });


        //intent to open library transactions on click of button
        lB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(StudentHomepage.this,StudentLibrary.class);
                startActivity(i3);
            }
        });

        //intent to go back to login
        sBackLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 = new Intent(StudentHomepage.this,StudentLogin.class);
                startActivity(i4);
            }
        });







    }
}