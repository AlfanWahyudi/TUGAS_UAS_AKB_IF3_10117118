package com.example.tugas_uas_akb_if3_10117118.ui.wisata;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class WisataViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> mText;

    public WisataViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Wisata fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
