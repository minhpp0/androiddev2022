package vn.edu.usth.usthweather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class WeatherActivity extends AppCompatActivity {
    private static final String STATE = "STATUS";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i(STATE, "onCreate");
    }
    @Override
    protected void onStart() {
        super.onStart();

        Log.i(STATE, "onStart");
    }
    @Override
    protected void onPause() {
        super.onPause();

        Log.i(STATE, "onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.i(STATE, "onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.i(STATE, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.i(STATE, "onDestroy");
    }

}