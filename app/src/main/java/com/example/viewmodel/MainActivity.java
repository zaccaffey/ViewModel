package com.example.viewmodel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView tvNumber;
    MainActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        tvNumber = findViewById(R.id.textView);

        // the ViewModelProvider class is used to connect UI Controller with the ViewModel
        viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);

        tvNumber.setText(viewModel.number+"");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewModel.addNumber();
                tvNumber.setText(viewModel.number+"");
            }
        });
    }

}