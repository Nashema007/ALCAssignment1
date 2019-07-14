package com.example.alcassignment1.activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.example.alcassignment1.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = this.getSupportActionBar();

        assert actionBar != null;
        actionBar.setTitle("ALC 4 PHASE 1");
        Button about = findViewById(R.id.aboutAlcBtn);
        Button profile = findViewById(R.id.profileBtn);


        about.setOnClickListener(v->{
            Intent intent = new Intent(this, AboutActivity.class);
            startActivity(intent);
        });

        profile.setOnClickListener(v->{
            Intent intent = new Intent(this, ProfileActivity.class);
            startActivity(intent);
        });

    }
}
