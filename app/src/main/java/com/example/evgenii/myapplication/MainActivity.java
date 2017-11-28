package com.example.evgenii.myapplication;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Pair;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.text_view).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), SecondActivity.class);
                Pair<View, String> pair1 = new Pair<>(findViewById(R.id.text_view), "text");
                Pair<View, String> pair2 = new Pair<>(findViewById(R.id.container), "container");

                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, pair1, pair2);
                startActivity(intent, options.toBundle());
            }
        });
    }
}
