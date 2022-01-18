package com.example.mvp1.main;

/**
 * Responsible for handling actions from the view and updating the UI as required.
 */
public class MainPresenter implements MainContract.Presenter{
    private MainContract.MvpView mView;
    MainPresenter(MainContract.MvpView view){
        mView = view;
    }
}
