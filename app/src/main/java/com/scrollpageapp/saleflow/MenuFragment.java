package com.scrollpageapp.saleflow;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class MenuFragment extends Fragment {

    TextView txtmenu;
    Button btnpurchase;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        NavController navController= Navigation.findNavController(view);

        txtmenu=view.findViewById(R.id.txtmenu);
        btnpurchase=view.findViewById(R.id.btnpurchase);
        
        btnpurchase.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("FragmentBackPressedCallback")
            @Override
            public void onClick(View view) {
                Log.d("ghdgdgd", "jdjdjjd");
                navController.navigate(R.id.action_mainFragment_to_firstFragment2);
            }
        });
    }
        }

