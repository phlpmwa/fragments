package com.example.fragments;


import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class FragmentB extends Fragment {
    private  static final String TAG= FragmentB.class.getSimpleName();
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e(TAG,"inside onAttach ");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG,"inside onCreate ");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater .inflate(R.layout.fragment_b, container, false);
        Log.e(TAG,"inside onCreateView ");
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e(TAG,"inside onActivityCreated ");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(TAG,"inside onStart ");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(TAG,"inside onResume ");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(TAG,"inside onPause ");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(TAG,"inside onStop ");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e(TAG,"inside onDestroyView ");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(TAG,"inside onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e(TAG,"inside onDetach ");
    }
}
