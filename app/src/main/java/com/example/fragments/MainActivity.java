package com.example.fragments;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
 public static final String TAG=MainActivity.class.getSimpleName();
    FragmentManager manager;
    private EditText edtNumOne, edtNumTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager=getSupportFragmentManager();
        edtNumOne= findViewById(R.id.num1);
        edtNumTwo= findViewById(R.id.num2);

    }

    public void sendDataToFragment(View view) {
        int firstNumber=Integer.valueOf(edtNumOne.getText().toString());
        int secondNumber= Integer.valueOf(edtNumTwo.getText().toString());
        Bundle bundle=new Bundle();
        bundle.putInt("first_number",firstNumber);
        bundle.putInt("second_number", secondNumber);
        FragmentA fragmentA=new FragmentA();
        fragmentA.setArguments(bundle);
        FragmentTransaction fragmentTransaction=manager.beginTransaction();
        fragmentTransaction.add(R.id.container, fragmentA, "fragA");
        fragmentTransaction.commit();

    }
}
