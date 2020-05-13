package com.example.fragments;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addFragmentProgrammatically();

    }
    public  void addFragmentProgrammatically()
    {
      HelloFragment helloFragment= new HelloFragment();
        FragmentManager manager=getFragmentManager();
        FragmentTransaction transaction=manager.beginTransaction();
        FragmentTransaction helloFragment1 = transaction.add(R.id.container, helloFragment, "helloFragment");
        transaction.commit();
    }
}
