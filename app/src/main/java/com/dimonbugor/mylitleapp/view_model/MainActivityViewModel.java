package com.dimonbugor.mylitleapp.view_model;

import android.content.Intent;
import android.view.View;

import androidx.lifecycle.ViewModel;

import com.dimonbugor.mylitleapp.FirstActivity;
import com.dimonbugor.mylitleapp.SecondActivity;

public class MainActivityViewModel extends ViewModel {

    public void onClickFirstBtn(View view) {
        Intent intent = new Intent(view.getContext(), FirstActivity.class);
        view.getContext().startActivity(intent);
    }

    public void onClickSecondBtn(View view) {
        Intent intent = new Intent(view.getContext(), SecondActivity.class);
        view.getContext().startActivity(intent);
    }
}
