package com.example.tablayoutproject2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class Tab1Fragment extends Fragment {
    private static final String TAG = "Tab1Fragment";

    private Button btnTEST;


    // Activiry로 이동하는 코드
    public void goTo1(View v){
        Intent i = new Intent(getContext(), Main2Activity.class);
        startActivity(i);
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab1,container,false);
        btnTEST = (Button)view.findViewById(R.id.btnTEST);

        btnTEST.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Activity로 이동하는 코드
                Intent i = new Intent(getContext(), Main2Activity.class);
                startActivity(i);
                Toast.makeText(getActivity(), "Testing Button Click 1", Toast.LENGTH_SHORT).show();
        };

    });

        return view;
    }


}
