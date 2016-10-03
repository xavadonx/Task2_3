package com.example.zer.task2_3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LeftFragment leftFragment = LeftFragment.newInstance();
        RightFragment rightFragment = RightFragment.newInstance();

        leftFragment.setSender(rightFragment);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_left, leftFragment, LeftFragment.class.getSimpleName())
                .replace(R.id.fragment_right, rightFragment, RightFragment.class.getSimpleName())
                .commit();
    }
}
