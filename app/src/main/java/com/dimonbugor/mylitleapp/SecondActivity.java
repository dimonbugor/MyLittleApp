package com.dimonbugor.mylitleapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import com.dimonbugor.mylitleapp.databinding.ActivitySecondBinding;
import com.dimonbugor.mylitleapp.view_model.SecondActivityViewModel;

public class SecondActivity extends AppCompatActivity {

    private ActivitySecondBinding binding;
    private SecondActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySecondBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.setLifecycleOwner(this);

        viewModel = new ViewModelProvider(this).get(SecondActivityViewModel.class);
        binding.setViewModel(viewModel);
    }
}