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

public class HelloFragment extends Fragment {
    private  static final String TAG=HelloFragment.class.getSimpleName();
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i(TAG,"inside onAttach ");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG,"inside onCreate ");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater .inflate(R.layout.hello_fragment, container, false);
        Log.i(TAG,"inside onCreateView ");
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i(TAG,"inside onActivityCreated ");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i(TAG,"inside onStart ");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i(TAG,"inside onResume ");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG,"inside onPause ");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i(TAG,"inside onStop ");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG,"inside onDestroyView ");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"inside onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i(TAG,"inside onDetach ");
    }
}
