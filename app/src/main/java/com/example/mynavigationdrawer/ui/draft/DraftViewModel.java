package com.example.mynavigationdrawer.ui.draft;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DraftViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DraftViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Drafts");
    }

    public LiveData<String> getText() {
        return mText;
    }
}