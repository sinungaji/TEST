package com.example.tugas1;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;

import android.content.Intent;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import static android.content.Context.MODE_PRIVATE;

public class FragmentHome extends Fragment {

    private Button logout;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedIntancesState){
        View view = inflater.inflate(R.layout.home,container,false);
        logout = view.findViewById(R.id.button);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferen = getActivity().getSharedPreferences("Enter", MODE_PRIVATE);
                SharedPreferences.Editor editor = preferen.edit();
                editor.putString("Don't Forget", "false");
                editor.apply();
                getActivity().finish();
            }
        });
        return view;
    }

}
