package com.gltrusov.deeplinktest.folder

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.text.method.LinkMovementMethod
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.gltrusov.deeplinktest.ComposeActivity
import com.gltrusov.deeplinktest.R
import com.gltrusov.deeplinktest.utils.createHtmlLinkClass

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val htmlLink = createHtmlLinkClass(this.javaClass.name, this)

        Log.d("MyTest", htmlLink)

        findViewById<Button>(R.id.btn_test).setOnClickListener {
            Intent(this, ComposeActivity::class.java).apply {
                startActivity(this)
            }
        }

        findViewById<TextView>(R.id.text_hello).apply {
            text = Html.fromHtml(htmlLink)
            movementMethod = LinkMovementMethod.getInstance()
        }
    }
}