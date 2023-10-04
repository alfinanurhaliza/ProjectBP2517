package com.example.bppraktikum02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.projectbp2517.R
import com.example.projectbp2517.databinding.ActivityBookKidBinding

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnMenu1:Button = findViewById(R.id.buttonMenu1)
        btnMenu1.setOnClickListener{
            val intent = Intent(this, ActivityBookKidBinding::class.java)
            startActivity(intent)
        }
    }
}