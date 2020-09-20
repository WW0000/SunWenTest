package com.gcc.demo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;


/**
 * @author guocongcong
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView tvCourse;
    private TextView tvExercise;
    private TextView tvMessage;
    private TextView tvMy;
    private View selectTab = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tvCourse = (TextView) findViewById(R.id.tvCourse);
        tvExercise = (TextView) findViewById(R.id.tvExercise);
        tvMessage = (TextView) findViewById(R.id.tvMessage);
        tvMy = (TextView) findViewById(R.id.tvMy);

        tvCourse.setOnClickListener(this);
        tvExercise.setOnClickListener(this);
        tvMessage.setOnClickListener(this);
        tvMy.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tvCourse:
                changeTabStatus(v);
                break;
            case R.id.tvExercise:
                changeTabStatus(v);
                break;
            case R.id.tvMessage:
                changeTabStatus(v);
                break;
            case R.id.tvMy:
                changeTabStatus(v);
                break;
        }
    }

    public void changeTabStatus(View view) {
        if (view == selectTab) {
            return;
        }
        if (selectTab != null) {
            ((TextView) selectTab).setTextColor(Color.parseColor("8b8b8b"));
            selectTab.setSelected(false);
        }
        selectTab = view;
        ((TextView) selectTab).setTextColor(Color.parseColor("00c084"));
        selectTab.setSelected(true);
    }
}
