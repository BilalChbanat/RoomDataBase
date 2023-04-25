package com.example.roomdb;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class AddNewWordViewModel extends AndroidViewModel {

    private WordsRepository mRepository;


    public AddNewWordViewModel(@NonNull Application application) {

        super(application);
        mRepository = new WordsRepository(application);
    }


    public void insert(Words word) {
        mRepository.insert(word);
    }

    public void update(Words word) {
        mRepository.update(word);
    }

}
