package com.fantasyxff.worksheetsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.fantasyxff.worksheet.HelloUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String hello = HelloUtil.getHello();
        Log.e("ddd", hello);
    }
}
