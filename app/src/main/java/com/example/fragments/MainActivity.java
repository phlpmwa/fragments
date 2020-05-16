package com.example.fragments;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
 public static final String TAG=MainActivity.class.getSimpleName();
    FragmentManager manager=getFragmentManager();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "onCreate");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy()");
    }

    public void removeFragmentB(View view) {
        FragmentB fragmentB=(FragmentB) manager.findFragmentByTag("fragB");
        FragmentTransaction transaction=manager.beginTransaction();
        if(fragmentB!=null)
        {
            transaction.remove(fragmentB);
            transaction.commit();
        }
        else {
            Toast.makeText(this, "Fragment B not found", Toast.LENGTH_LONG).show();
        }
    }

    public void addFragmentB(View view) {
        FragmentB fragmentB= new FragmentB();

        FragmentTransaction transaction=manager.beginTransaction();
        transaction.add(R.id.container, fragmentB, "fragB");
        transaction.commit();
    }

    public void removeFragmentA(View view) {
       FragmentA fragmentA=(FragmentA) manager.findFragmentByTag("fragA");
       FragmentTransaction transaction=manager.beginTransaction();
        if(fragmentA!=null)
        {
            transaction.remove(fragmentA);
            transaction.commit();
        }
        else {
            Toast.makeText(this, "Fragment A not found", Toast.LENGTH_LONG).show();
        }

    }

    public void addFragmentA(View view) {
        FragmentA fragmentA= new FragmentA();
        FragmentTransaction transaction=manager.beginTransaction();
            transaction.add(R.id.container, fragmentA, "fragA");
            transaction.commit();

    }

    public void replaceByFragmentA(View view) {
        FragmentA fragmentA=new FragmentA();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.replace(R.id.container, fragmentA,"fragA");
        transaction.commit();
    }

    public void replaceByFragmentB(View view) {
        FragmentB fragmentB=new FragmentB();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.replace(R.id.container, fragmentB,"fragA");
        transaction.commit();

    }

    public void hideFragmentA(View view) {
    }

    public void showFragmentA(View view) {
    }

    public void detachFragmentA(View view) {
        FragmentA fragmentA=(FragmentA) manager.findFragmentByTag("fragA");
        FragmentTransaction transaction=manager.beginTransaction();
        if(fragmentA!=null)
        {
            transaction.detach(fragmentA);
            transaction.commit();
        }

        else
        {
            Toast.makeText(this, "Fragment A not found", Toast.LENGTH_LONG).show();
        }

    }

    public void attachFragmentA(View view) {
    }
}
