package com.example.menuactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addclickevent(view: View) {
intent= Intent(this,RegisterActivity::class.java)
        startActivity(intent)
    }

    fun subclickevent(view: View) {
        intent= Intent(this,SubmitActivity::class.java)
        startActivity(intent)
    }
}