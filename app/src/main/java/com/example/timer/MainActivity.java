package com.example.timer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import java.util.Locale;




public class MainActivity extends AppCompatActivity {
    private  TextView mTextViewCountDown;
    private  Button mButtonStartPause;
    private  Button getmButtonReset;

    private  CountDownTimer mCountDownTimer;
    private static final long START_TIME = 10000;  // タイマーの上限
    private long mTimeLeftInMillis = START_TIME;  //タイマーのプロパティ
    private  boolean mTimerRunning;  // タイマー起動中のプロパティ

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextViewCountDown = findViewById(R.id.text_view_countdown);
        mButtonStartPause = findViewById(R.id.button_start_pause);
        getmButtonReset = findViewById(R.id.buttonreset);

    }
}