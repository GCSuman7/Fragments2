package com.e.fragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import fragment.SecondFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnFragment;
    private  Boolean status = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFragment = findViewById(R.id.btnFragment);
        btnFragment.setOnClickListener(this);
    }
    public void onClick(View v){

        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentTransaction.add(R.id.fragmentContainer,firstFragment);
        FragmentTransaction.commit();
        btnFragment.setText("load Second Fragment");
        status = false;
    }
    else{
        SecondFragment secondFragment = new SecondFragment();
        FragmentTransaction.add(R.id.fragmentContainer)
    }

}
