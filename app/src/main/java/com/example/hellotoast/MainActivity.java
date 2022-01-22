package com.example.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnCount;
    TextView txtCount;

    int mCount =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCount = findViewById(R.id.btn_count);
        txtCount = findViewById(R.id.show_count);

        btnCount.setOnClickListener(view -> {
            mCount++;
            txtCount.setText("" + mCount);
        });
    }

    public void showToast(View view) {


        Toast toast = Toast.makeText(this,R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();



        mCount=0;
        txtCount.setText("" + mCount);


    }
}