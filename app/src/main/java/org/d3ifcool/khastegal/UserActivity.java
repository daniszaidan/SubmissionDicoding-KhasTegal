package org.d3ifcool.khastegal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        getSupportActionBar().setTitle("About");
    }
}
