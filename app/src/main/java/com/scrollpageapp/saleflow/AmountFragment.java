package com.scrollpageapp.saleflow;


import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class AmountFragment extends Fragment {

    TextView saleText;
    EditText etAmount;
    EditText etMsg;
    Button proceed_to_pay;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_amount, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        NavController navController= Navigation.findNavController(view);


        saleText = view.findViewById(R.id.saleText);
        etAmount= view.findViewById(R.id.etAmount);
        etMsg = view.findViewById(R.id.etMsg);
        proceed_to_pay =view.findViewById(R.id.proceed_to_pay);
        proceed_to_pay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etAmount.getText().toString().isEmpty()){
                    //field is empty
                    Toast.makeText(getContext(),getString(R.string.exit_survey_toast),Toast.LENGTH_LONG).show();
                }else
                {
                    navController.navigate(R.id.action_firstFragment2_to_second_Fragment2);
                }}
        });}
}

