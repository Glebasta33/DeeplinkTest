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



        val example = "https://github.com/Glebasta33/DeeplinkTest/blob/master/app/src/main/java/com/gltrusov/deeplinktest/ComposeActivity.kt"
        val baseUrl = "https://github.com/Glebasta33/DeeplinkTest/blob/master/app/src/main/java"
        val packageName = activityManager.runningAppProcesses[0].processName.replace('.', '/')
        val currentFileName = this.javaClass.name.replace('.', '/')


        Log.d("MyTest", currentFileName)

        val link = "$baseUrl/$currentFileName.kt"

        Log.d("MyTest", link)

        findViewById<Button>(R.id.btn_test).setOnClickListener {
            Intent(this, ComposeActivity::class.java).apply {
                startActivity(this)
            }
        }
    }
}