package com.gltrusov.deeplinktest.folder

import android.annotation.SuppressLint
import android.app.ActivityManager
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.gltrusov.deeplinktest.ComposeActivity
import com.gltrusov.deeplinktest.R

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val activityManager = getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
//        activityManager.runningAppProcesses.forEach {
//            Log.d("MyTest", it.processName)
//        }

        findViewById<Button>(R.id.btn_test).setOnClickListener {
            Intent(this, ComposeActivity::class.java).apply {
                startActivity(this)
            }
        }
    }
}