package com.example.navcomponentdemo.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navcomponentdemo.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
int i=0;
        Log.e("Title","This is print method");
        int j=10;
        Log.e("Title","Thanks for visit");

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this HomeFragment
        return inflater.inflate(R.layout.fragment_fragment, container, false);
    }

}
