package com.scrollpageapp.saleflow;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;


public class Card_Fragment extends Fragment {

    TextView etPin;
    TextView etNum;
    EditText etCard;
    TextView etExp;
    EditText etExpdate;
    Button sub;
    ProgressBar progressBar1;
    LinearLayout linear;
    TextView wait;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_card, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        NavController navController = Navigation.findNavController(view);
        etPin = view.findViewById(R.id.etPin);
        etNum = view.findViewById(R.id.etNum);
        etCard = view.findViewById(R.id.etCard);
        etExp = view.findViewById(R.id.etExp);
        etExpdate = view.findViewById(R.id.etExpdate);
        sub = view.findViewById(R.id.sub);
        linear = view.findViewById(R.id.linear);
        progressBar1 = view.findViewById(R.id.progressBar1);
        wait = view.findViewById(R.id.wait);

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hideKeyboardFrom(requireContext(),view);
                if (etCard.getText().toString().isEmpty()) {
                    //field is empty
                    Toast.makeText(getContext(),getString(R.string.exit_survey_toast),Toast.LENGTH_LONG).show();
                } else if (etExpdate.getText().toString().isEmpty()) {
                        //field is empty
                    Toast.makeText(getContext(),getString(R.string.exit_survey_toast),Toast.LENGTH_LONG).show();
                    } else {

                    linear.setVisibility(View.GONE);
                    progressBar1.setVisibility(View.VISIBLE);
                    wait.setVisibility(View.VISIBLE);

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        navController.navigate(R.id.action_second_Fragment2_to_third_Fragment2);
                    }
                }, 2500);
            }
            }
        });
    }
    public void hideKeyboardFrom(Context context, View view) {
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Activity.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
