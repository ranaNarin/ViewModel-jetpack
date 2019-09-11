package com.service.demo;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String TAG=this.getClass().getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvNumber=(TextView)findViewById(R.id.tvNumber);
        //MainActivityViewModel mainActivityViewModel=new MainActivityViewModel();
        MainActivityViewModel mainActivityViewModel= ViewModelProviders.of(this).get(MainActivityViewModel.class);

        tvNumber.setText(mainActivityViewModel.getNumber());

        Log.e(TAG, "Random number set");

    }
}
