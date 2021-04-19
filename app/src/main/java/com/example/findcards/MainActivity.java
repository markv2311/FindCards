package com.example.findcards;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onHomeClick(View view){
        Intent goHome = new Intent(this, MainActivity.class);
        startActivity(goHome);
        finish();
    }

    public void onAddClick(View view){
        Intent addCard = new Intent(this, AddCard.class);
        startActivity(addCard);
    }

    public void onProfileClick(View view){
        Intent viewProfile = new Intent(this, UserProfile.class);
        startActivity(viewProfile);
    }

}