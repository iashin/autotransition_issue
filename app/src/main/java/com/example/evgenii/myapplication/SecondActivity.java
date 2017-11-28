package com.example.evgenii.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.transition.AutoTransition;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        AutoTransition transition = new AutoTransition();
        transition.setDuration(1000);
        getWindow().setSharedElementEnterTransition(transition);

        findViewById(R.id.text_view_second).setTransitionName("text");
        findViewById(R.id.container_second).setTransitionName("container");
    }
}
