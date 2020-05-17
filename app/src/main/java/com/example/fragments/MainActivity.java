package com.example.fragments;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity implements MyListener {
 public static final String TAG=MainActivity.class.getSimpleName();
   private FragmentManager manager;
   private int firstNum;
   private  int secondNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager=getSupportFragmentManager();
        addFragmentA();
        addFragmentB();

    }
    private void addFragmentA()
    {
    FragmentA fragmentA=new FragmentA();
    FragmentTransaction transaction=manager.beginTransaction();
    transaction.add(R.id.container, fragmentA, "fragA");
    transaction.commit();
    }
    private void addFragmentB()
    {
        FragmentB fragmentB=new FragmentB();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.add(R.id.container2, fragmentB, "fragB");
        transaction.commit();
    }


    @Override
    public void addTwoNumbers(int num1, int num2) {
        this.firstNum=num1;
        this.secondNum=num2;
        Toast.makeText(this,"data received",Toast.LENGTH_LONG).show();


    }

    public void sendDataToFragmentB(View view) {
        FragmentB fragmentB= (FragmentB) manager.findFragmentByTag("fragB");
        fragmentB.addTwoNumbersInFragmentB(firstNum,secondNum);
    }
}
