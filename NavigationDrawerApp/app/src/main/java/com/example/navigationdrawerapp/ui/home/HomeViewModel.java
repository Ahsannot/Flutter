package com.example.navigationdrawerapp.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("TUESDAY, JANUARY 26, 2023");
    }

    public LiveData<String> getText() {
        return mText;
    }
}