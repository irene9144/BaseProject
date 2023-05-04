package com.gnapse.jenny.baseproject;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

public class MainViewModel extends BaseViewModel{

    private MutableLiveData<String> currentName;
    private MutableLiveData<Boolean> button1Clicked;
    private MutableLiveData<Boolean> button2Clicked;


    public MutableLiveData<String> getCurrentName() {
        if(currentName == null) {
            currentName = new MutableLiveData<String>();
        }
        return currentName;
    }

    public MutableLiveData<Boolean> getButton1Clicked() {
        return button1Clicked;
    }

    public void setButton1Clicked(MutableLiveData<Boolean> button1Clicked) {
        this.button1Clicked = button1Clicked;
    }

    public MainViewModel(@NonNull Application application) {
        super(application);
    }
}
