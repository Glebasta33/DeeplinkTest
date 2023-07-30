package com.gltrusov.deeplinktest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.gltrusov.deeplinktest.fragments.FirstFragment
import com.gltrusov.deeplinktest.fragments.SecondFragment

class DeeplinkTestingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_deeplink_testing)
        val pageParam = intent.data?.getQueryParameter("page")

        val fragment = when (pageParam) {
            "1" -> FirstFragment.newInstance("","")
            "2" -> SecondFragment.newInstance("", "")
            else -> null
        }

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment!!)
            .commit()
    }
}