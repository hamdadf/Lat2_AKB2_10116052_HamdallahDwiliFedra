package com.hamdadf.lat2_akb2_10116052_hamdallahdwilifedra;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VerifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);

        Button verify = (Button) findViewById(R.id.btnVerifySend);

        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VerifyActivity.this, UserActivity.class);
                startActivity(intent);
            }
        });
    }
}
