package com.siddhantbhardwaj.fragmentsapp;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FirstFragment extends Fragment {


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Toast.makeText(
                getActivity(),
                "onAttach() is called",
                Toast.LENGTH_LONG
        ).show();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(
                getActivity(),
                "onCreate() is called",
                Toast.LENGTH_LONG
        ).show();
    }

    @Override
    public void onResume() {
        super.onResume();
        Toast.makeText(
                getActivity(),
                "onResume() is called",
                Toast.LENGTH_LONG
        ).show();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(
                R.layout.fragment_first,
                container,
                false
        );
        Button fragBtn = view.findViewById(R.id.fragBtn);
        TextView text = view.findViewById(R.id.title);

        fragBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(
                        getActivity(),
                        "Welcome to the First Fragment",
                        Toast.LENGTH_LONG
                ).show();
            }
        });

        return view;
    }
}