package com.example.towhid.preloder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lusfold.spinnerloading.SpinnerLoading;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SpinnerLoading view = findViewById(R.id.spinner_loading);
        view.setPaintMode(1);
        view.setCircleRadius(8);
        view.setItemCount(6);
    }
}
