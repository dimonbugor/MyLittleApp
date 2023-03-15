package com.dimonbugor.mylitleapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.dimonbugor.mylitleapp.databinding.ActivityFirstBinding;
import com.dimonbugor.mylitleapp.view_model.FirstActivityViewModel;

public class FirstActivity extends AppCompatActivity {

    private ActivityFirstBinding binding;
    private FirstActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFirstBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.setLifecycleOwner(this);

        viewModel = new ViewModelProvider(this).get(FirstActivityViewModel.class);
        binding.setViewModel(viewModel);
    }
}