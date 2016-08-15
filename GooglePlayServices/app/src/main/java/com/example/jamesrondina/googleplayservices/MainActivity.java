package com.example.jamesrondina.googleplayservices;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.analytics.HitBuilders;
import com.google.android.gms.analytics.Tracker;

public class MainActivity extends AppCompatActivity {

    Button mButton1, mButton2, mButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1 = (Button) findViewById(R.id.benjaminButton);
        mButton2 = (Button) findViewById(R.id.pushButton);
        mButton3 = (Button) findViewById(R.id.iamButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Tracker t = AnalyticsApplication.getDefaultTracker();

                String categoryId = null;
                String actionId = null;

                switch (view.getId()) {
                    case R.id.benjaminButton:
                        categoryId = "click";
                        actionId = "clicked Benjamin";
                        break;
                    case R.id.pushButton:
                        categoryId = "click";
                        actionId = "clicked Push";
                        break;
                    case R.id.iamButton:
                        categoryId = "click";
                        actionId = "clicked I AM BUTTON";
                        break;
                }

                t.send(new HitBuilders.EventBuilder()
                        .setCategory(categoryId)
                        .setAction(actionId)
                        .build());

            }
        };

        mButton1.setOnClickListener(listener);
        mButton2.setOnClickListener(listener);
        mButton3.setOnClickListener(listener);

    }



}
