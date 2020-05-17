package com.example.fragments;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity implements FragmentManager.OnBackStackChangedListener {
 public static final String TAG=MainActivity.class.getSimpleName();
    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager=getSupportFragmentManager();
        manager.addOnBackStackChangedListener(this);
    }

    public void removeFragmentB(View view) {
        FragmentB fragmentB=(FragmentB) manager.findFragmentByTag("fragB");
        FragmentTransaction transaction=manager.beginTransaction();
        if(fragmentB!=null)
        {
            transaction.remove(fragmentB);
            transaction.addToBackStack("ReplaceFragB");
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
        transaction.addToBackStack("AddFragB");
        transaction.commit();
    }

    public void removeFragmentA(View view) {
       FragmentA fragmentA;
        fragmentA = (FragmentA) manager.findFragmentByTag("fragA");
        FragmentTransaction transaction=manager.beginTransaction();
        if(fragmentA!=null)
        {
            transaction.remove(fragmentA);
            transaction.addToBackStack("RemoveFragB");
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
        transaction.addToBackStack("AddFragA");
            transaction.commit();

    }

    public void replaceByFragmentA(View view) {
        FragmentA fragmentA=new FragmentA();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.replace(R.id.container, fragmentA,"fragA");
        transaction.addToBackStack("ReplaceFragA");
        transaction.commit();
    }

    public void replaceByFragmentB(View view) {
        FragmentB fragmentB=new FragmentB();
        FragmentTransaction transaction=manager.beginTransaction();
        transaction.replace(R.id.container, fragmentB,"fragB");
        transaction.addToBackStack("ReplaceFragB");
        transaction.commit();

    }

    public void hideFragmentA(View view) {
        FragmentA fragmentA=(FragmentA) manager.findFragmentByTag("fragA");
        FragmentTransaction transaction=manager.beginTransaction();
        if(fragmentA!=null)
        {
            transaction.hide(fragmentA);
            transaction.addToBackStack("HideFragA");
            transaction.commit();
        }

        else
        {
            Toast.makeText(this, "Fragment A not found", Toast.LENGTH_LONG).show();
        }
    }

    public void showFragmentA(View view) {
        FragmentA fragmentA=(FragmentA) manager.findFragmentByTag("fragA");
        FragmentTransaction transaction=manager.beginTransaction();
        if(fragmentA!=null)
        {
            transaction.show(fragmentA);
            transaction.addToBackStack("ShowFragA");
            transaction.commit();
        }

        else
        {
            Toast.makeText(this, "Fragment A not found", Toast.LENGTH_LONG).show();
        }
    }

    public void detachFragmentA(View view) {
        FragmentA fragmentA=(FragmentA) manager.findFragmentByTag("fragA");
        FragmentTransaction transaction=manager.beginTransaction();
        if(fragmentA!=null)
        {
            transaction.detach(fragmentA);
            transaction.addToBackStack("DetachFragA");
            transaction.commit();
        }

        else
        {
            Toast.makeText(this, "Fragment A not found", Toast.LENGTH_LONG).show();
        }

    }

    public void attachFragmentA(View view) {
        FragmentA fragmentA=(FragmentA) manager.findFragmentByTag("fragA");
        FragmentTransaction transaction=manager.beginTransaction();
        if(fragmentA!=null)
        {
            transaction.attach(fragmentA);
            transaction.addToBackStack("AttachFragA");
            transaction.commit();
        }

        else
        {
            Toast.makeText(this, "Fragment A not found", Toast.LENGTH_LONG).show();
        }
    }

    public void dummyBackButtonClick(View view) {
        manager.popBackStack();
    }

    public void pop_AddFragA_Inclusive_transaction(View view) {
        manager.popBackStack("AddFragA",FragmentManager.POP_BACK_STACK_INCLUSIVE);
    }

    public void pop_AddFragB_transaction(View view) {
        manager.popBackStack("AddFragB",0);
    }

    @Override
    public void onBackStackChanged() {
        int length=manager.getBackStackEntryCount();
        StringBuilder msg= new StringBuilder();
        for(int i=length-1; i>=10;i--)
        {
            msg.append("Index").append(i).append(":");
            msg.append(manager.getBackStackEntryAt(i).getName());
            msg.append("\n");

        }
        Log.i(TAG, "\n"+msg.toString()+"\n");

    }

    @Override
    public void onBackPressed() {
        if(manager.getBackStackEntryCount()>0)
        {
            manager.popBackStack();
        }
        else {
            super.onBackPressed();
        }
    }
}
