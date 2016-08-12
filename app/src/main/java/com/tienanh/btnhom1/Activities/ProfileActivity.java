package com.tienanh.btnhom1.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;

import com.tienanh.btnhom1.Adapter.ProfileAdapter;
import com.tienanh.btnhom1.R;

import java.util.ArrayList;
import java.util.List;

public class ProfileActivity extends AppCompatActivity {
    RecyclerView rcView;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.me);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Toolbar mToolbar = (Toolbar)findViewById(R.id.profile_toolbar);
        setSupportActionBar(mToolbar);



        rcView = (RecyclerView)findViewById(R.id.recyclerViewProfile);
        rcView.setLayoutManager(new LinearLayoutManager(this));

        List<Object> itemList = new ArrayList<>();
        itemList.add(new Header("Dany Targaryen", "Valyria"));
        itemList.add(new ItemProfile("Rob Stark", "Winterfell"));
        itemList.add(new ItemProfile("Jon Snow", "Castle Black"));
        itemList.add(new ItemProfile("Tyrion Lanister", "King's Landing"));

        ProfileAdapter profileAdapter = new ProfileAdapter(itemList);
        rcView.setAdapter(profileAdapter);


    }



}
