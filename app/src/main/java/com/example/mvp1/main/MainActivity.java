 package com.example.mvp1.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.mvp1.R;

 /**
  * Displays the main screen
  */

 public class MainActivity extends AppCompatActivity implements MainContract.MvpView {

    EditText email, password;
    Button login;

    private MainPresenter presenter;         //creating a handler
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);

        presenter = new MainPresenter(this);


    }
}