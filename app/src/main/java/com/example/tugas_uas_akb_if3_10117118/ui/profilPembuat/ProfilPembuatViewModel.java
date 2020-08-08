package com.example.tugas_uas_akb_if3_10117118.ui.profilPembuat;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProfilPembuatViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private MutableLiveData<String> mText;

    public ProfilPembuatViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Profil Pembuat fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
