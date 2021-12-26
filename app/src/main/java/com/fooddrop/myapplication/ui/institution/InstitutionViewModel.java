package com.fooddrop.myapplication.ui.institution;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InstitutionViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public InstitutionViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}