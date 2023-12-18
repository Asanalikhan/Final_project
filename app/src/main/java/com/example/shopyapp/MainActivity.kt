package com.example.shopyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        val userLogin: EditText = findViewById(R.id.user_login)
        val userEmial: EditText = findViewById(R.id.user_email)
        val userPass: EditText = findViewById(R.id.user_pass)
        val button: Button = findViewById(R.id.button_reg)
        val linkToAuth: TextView = findViewById(R.id.link_to_auth)

        linkToAuth.setOnClickListener {
            val intent = Intent(this, AuthActivity::class.java)
            startActivity(intent)
        }

        button.setOnClickListener{
            val login = userLogin.text.toString().trim()
            val email = userEmial.text.toString().trim()
            val pass = userPass.text.toString().trim()
            
            if(login == "" || email == "" || pass == ""){
                Toast.makeText(this, "not all areas filled", Toast.LENGTH_LONG).show()
            }
            else{
                val user = User(login, email, pass)

                val db = DBHelper(this, null)
                db.addUser(user)
                Toast.makeText(this, "user $login added", Toast.LENGTH_LONG).show()

                userLogin.text.clear()
                userEmial.text.clear()
                userPass.text.clear()
            }
            
        }

    }
}