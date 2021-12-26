package com.fooddrop.myapplication.ui.drop_history;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DropHistoryModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DropHistoryModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is DropHistory fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}