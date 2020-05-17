package com.example.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;

public class FragmentB extends Fragment {
    private  static final String TAG=FragmentB.class.getSimpleName();
    private AppCompatTextView textView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        textView=view.findViewById(R.id.txvResult);
        return view ;
    }
    public void addTwoNumbersInFragmentB(int x, int y)
    {
    int result=x+y;
    textView.setText("Result: "+result);
    }
}
