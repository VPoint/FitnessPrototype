package com.gng4120.fitnessprototype;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class WorkoutActivity extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);
        super.onCreateDrawer();
    }
}
