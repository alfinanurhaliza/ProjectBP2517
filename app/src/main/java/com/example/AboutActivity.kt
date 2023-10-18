package com.example

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.projectbp2517.R

class AboutActivity : AppCompatActivity() {
    private fun Intent(actionDial: String, number: String) {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        //instace
        val imgCall:ImageView = findViewById(R.id.imageViewCall)
        val web:ImageView = findViewById(R.id.imageViewWeb)
        val location:ImageView = findViewById(R.id.imageViewLocation)
        //event saat image call di-klik
        imgCall.setOnClickListener {
            Val callIntent:Intent = Uri.parse("tel:088213000777").let {
                number-> Intent(Intent.ACTION_DIAL, number)
            }
            startActivity(callIntent)
        }
    }
}