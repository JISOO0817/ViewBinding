package com.example.viewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.viewbinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        userProfile();
    }

    private void userProfile() {

        User user = new User();
        user.name = "김영희";
        user.email = "younghee@gmail.com";
        user.address = " 서울 어딘가 ";

        updateUI(user);
    }

    private void updateUI(User user) {

        binding.name.setText(user.name);
        binding.email.setText(user.email);
        binding.address.setText(user.address);

    }
}