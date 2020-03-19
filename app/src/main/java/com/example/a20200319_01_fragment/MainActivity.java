package com.example.a20200319_01_fragment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Binder;
import android.os.Bundle;
import android.renderscript.ScriptGroup;

import com.example.a20200319_01_fragment.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

  ActivityMainBinding binding = null;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

    }
}
