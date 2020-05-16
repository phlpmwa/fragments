package com.example.fragments;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentA extends Fragment {
    private Button btnAdd;
    private TextView txvResult;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater .inflate(R.layout.fragment_a, container, false);
        Bundle bundle=getArguments();
        final int firstNum=bundle.getInt("first_number",0);
        final int secondNum=bundle.getInt("second_number",0);
        btnAdd= view.findViewById(R.id.btnAdd);
        txvResult= view.findViewById(R.id.results);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
         addTwoNumbers(firstNum, secondNum);
            }
        });
        return view;
    }

    private void addTwoNumbers(int firstNum, int secondNum) {
        int result=firstNum+secondNum;
        txvResult.setText("Result: "+result);
    }

}
