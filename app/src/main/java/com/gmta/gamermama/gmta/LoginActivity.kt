package com.gmta.gamermama.gmta

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    lateinit var emailOrUserName: EditText
    lateinit var passCode: EditText
    lateinit var login: Button
    lateinit var haveAc: TextView
    lateinit var userName: EditText
    lateinit var emailID: EditText
    lateinit var passCode1: EditText
    lateinit var createAccount: Button
    lateinit var dontHaveAc: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //LogIn Activity for Users
        emailOrUserName = findViewById(R.id.email)
        passCode = findViewById(R.id.passCode)
        login = findViewById(R.id.loginBtn)

        login.setOnClickListener {
            Toast.makeText(this, "Once More!!", Toast.LENGTH_LONG).show()
        }

        haveAc =findViewById(R.id.haveAC)
        haveAc.setOnClickListener {
            Toast.makeText(this, "Clicked going to signUp Activity", Toast.LENGTH_LONG).show()
        }

    }
}
