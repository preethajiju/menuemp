package com.example.menuactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }

    fun registerclickevent(view: View) {
        var getName=findViewById<EditText>(R.id.name)
        var getCode=findViewById<EditText>(R.id.code)
        var getSal=findViewById<EditText>(R.id.sal)
        Toast.makeText(this,getName.text.toString()+" "+getCode.text.toString()+" "+getSal.text.toString(),Toast.LENGTH_LONG).show()
    }

    fun backevent(view: View) {
        intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}