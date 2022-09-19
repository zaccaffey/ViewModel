package com.example.viewmodel;

import androidx.lifecycle.ViewModel;

// Do not store UI References or Elements
public class MainActivityViewModel extends ViewModel {
    int number = 0;

    public void addNumber() {
        ++number;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
    }
}
