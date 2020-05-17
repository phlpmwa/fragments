package com.example.fragments;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity implements MyListener {
 public static final String TAG=MainActivity.class.getSimpleName();
   private FragmentManager manager;
    private TextView txvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager=getSupportFragmentManager();
        txvResult= findViewById(R.id.results);
        addFragmentA();

    }
    private void addFragmentA()
    {
    FragmentA fragmentA=new FragmentA();
    FragmentTransaction transaction=manager.beginTransaction();
    transaction.add(R.id.container, fragmentA, "fragA");
    transaction.commit();
    }


    @Override
    public void addTwoNumbers(int num1, int num2) {
    int result=num1+num2;
    txvResult.setText("Result: "+result);
    }
}
