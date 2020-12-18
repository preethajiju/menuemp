package com.example.menuactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class SubmitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_submit)
    }

    fun subclickevent(view: View) {
        var getName=findViewById<EditText>(R.id.name)
        var getAdd=findViewById<EditText>(R.id.addr)
        var getPhn=findViewById<EditText>(R.id.num)
        Toast.makeText(this,getName.text.toString()+" "+getAdd.text.toString()+" "+getPhn.text.toString(),
            Toast.LENGTH_LONG).show()
    }
    fun backevent(view: View) {
        intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}