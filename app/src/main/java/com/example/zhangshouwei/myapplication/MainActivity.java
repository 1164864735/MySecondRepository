package com.example.zhangshouwei.myapplication;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.io.File;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        this.getAssets()
        new File("eiije").getAbsolutePath()
        List<PackageInfo> installedPackages = getPackageManager().getInstalledPackages(0);
    }
}
