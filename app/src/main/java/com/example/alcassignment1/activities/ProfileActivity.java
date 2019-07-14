package com.example.alcassignment1.activities;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.alcassignment1.R;
import com.example.alcassignment1.adapters.ProfileAdapter;
import com.example.alcassignment1.modals.Profile;

import java.util.ArrayList;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ActionBar actionBar = this.getSupportActionBar();

        assert actionBar != null;
        actionBar.setTitle("My Profile");
        actionBar.setDisplayHomeAsUpEnabled(true);

        RecyclerView profileRecyclerView = findViewById(R.id.profileRecyclerView);
        RecyclerView.LayoutManager  layoutManager = new LinearLayoutManager(this);
        profileRecyclerView.setLayoutManager(layoutManager);
        profileRecyclerView.setHasFixedSize(true);

        String[] label = {"Track:", "Country:", "Email:", "Phone Number:", "Slack Username:"};
        String[] value = {"Android", "Zimbabwe", "ashleychak@live.com", "263773523429", "@Nashema007"};

        ArrayList<Profile> profileList = new ArrayList<>();

        for(int i = 0; i<label.length; i++){
            profileList.add(new Profile(label[i], value[i]));
        }
        ProfileAdapter profileAdapter = new ProfileAdapter(this, profileList);
        profileRecyclerView.setAdapter(profileAdapter);


    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
