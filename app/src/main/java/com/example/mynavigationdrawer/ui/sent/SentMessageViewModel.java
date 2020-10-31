package com.example.mynavigationdrawer.ui.sent;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SentMessageViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SentMessageViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Sent Messages");
    }

    public LiveData<String> getText() {
        return mText;
    }
}