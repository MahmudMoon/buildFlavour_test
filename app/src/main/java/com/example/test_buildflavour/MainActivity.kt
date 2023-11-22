package com.example.test_buildflavour

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.test_buildflavour.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(activityMainBinding.root)


        activityMainBinding.tvBaseUrl.text = BuildConfig.BASE_API

        activityMainBinding.tvPackage.text = packageName

        activityMainBinding.tvVersion.text = BuildConfig.last_version.toString()
    }
}