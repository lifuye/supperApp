package com.example.lfy.supperapp.common;

import android.support.v7.app.AppCompatActivity;

import java.util.Properties;

/**
 * Created by lfy on 2018/6/21.
 */

public class BaseCompatActivity extends AppCompatActivity {

    public Properties properties = PropertiesUtil.getProperties(this);
}
