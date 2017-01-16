package com.example.stefi.remap.view.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.stefi.remap.R;

/**
 * Created by Stefi on 16.01.2017.
 */

public class NewTaskActivity extends AppCompatActivity {

    ImageView mCalendar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newtask);

        mCalendar = (ImageView) findViewById(R.id.calendar);
        mCalendar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
