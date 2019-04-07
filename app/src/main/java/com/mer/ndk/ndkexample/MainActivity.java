package com.mer.ndk.ndkexample;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
    //export PATH=$PATH:/home/yagnik/Programs/android-ndk


    public native String getMsg();

    static {
        System.loadLibrary("ndkmsg");
    }

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.text);
    }

    public void showMsg(View view) {
        textView.setText(getMsg());
    }
}
