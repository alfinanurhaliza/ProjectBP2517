package com.example

import LoginModel
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.bppraktikum02.HomeActivity
import com.example.projectbp2517.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login3)
        //instance
        val btnLogin:Button = findViewById(R.id.buttonLogin)
        val txtUsername:EditText = findViewById(R.id.editTextTextUsername)
        val txtPassword:EditText = findViewById(R.id.editTextTextPassword)
        val logModel = LoginModel()
        //event btn login di-klik
        btnLogin.setOnClickListener {
            //input data
            logModel.username = txtUsername.text.toString()
            logModel.password = txtPassword.text.toString()
            //validasi login
            if(logModel.loginCek() == true){
                //call home activity
                val intentHome = Intent(this,HomeActivity::class.java)
                startActivity(intentHome)
            }else{
                Toast.makeText(this, "Username/Password salah", Toast.LENGTH_SHORT).show()
            }

        }
    }
}