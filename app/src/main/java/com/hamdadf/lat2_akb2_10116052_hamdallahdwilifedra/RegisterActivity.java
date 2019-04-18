package com.hamdadf.lat2_akb2_10116052_hamdallahdwilifedra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        TextView register = findViewById(R.id.btnRegisterRegister);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navireg();
            }
        });
    }

    public void navireg() {
        Intent intent = new Intent(this, AlmostthereActivity.class);
        startActivity(intent);
    }
}
