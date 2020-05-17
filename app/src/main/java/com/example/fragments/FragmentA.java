package com.example.fragments;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentA extends Fragment {
    private Button btnSend;
    private EditText edtNumOne, edtNumTwo;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view=inflater .inflate(R.layout.fragment_a, container, false);

        btnSend= view.findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNumOne= view.findViewById(R.id.num1);
                edtNumTwo= view.findViewById(R.id.num2);
         sendData();
            }
        });
        return view;
    }

    private void sendData() {
        int firstNum= Integer.valueOf(edtNumOne.getText().toString());
        int secondNum=Integer.valueOf(edtNumTwo.getText().toString());
        MyListener myListener= (MyListener) getActivity();
        myListener.addTwoNumbers(firstNum, secondNum);
    }

}
