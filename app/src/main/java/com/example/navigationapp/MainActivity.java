package com.example.navigationapp;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton navIcon = findViewById(R.id.navIconButton);
        final FloatingActionButton leftButton = findViewById(R.id.leftArrow);
        final FloatingActionButton rightButton = findViewById(R.id.rightArrow);
        final FloatingActionButton eyeglassButton = findViewById(R.id.eyeglassIcon);


        leftButton.hide();
        rightButton.hide();
        eyeglassButton.hide();

        navIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.isPressed()) {
                    v.setVisibility(View.GONE);
                    leftButton.show();
                    rightButton.show();
                    eyeglassButton.show();
                }
            }
        });
    }
}
