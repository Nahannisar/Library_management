package com.example.collegelibrary;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FullDescriptionActivity extends AppCompatActivity {

    private TextView txtFullDescription;
    private String description;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fulldescription);

        txtFullDescription = (TextView) findViewById(R.id.txt_full_description);


        Intent intent = getIntent();
        description = intent.getExtras().getString("description");

        txtFullDescription.setText(description);

    }
}
