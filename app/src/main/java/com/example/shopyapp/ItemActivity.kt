package com.example.shopyapp

import android.annotation.SuppressLint
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class ItemActivity : AppCompatActivity() {
    var image: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item)

        image = findViewById(R.id.item_list_image_one)
        val title: TextView = findViewById(R.id.item_list_title_one)
        val text: TextView = findViewById(R.id.item_list_text)


        title.text = intent.getStringExtra("itemTitle")
        text.text = intent.getStringExtra("itemText")

        var imageUrl = "https://images.unsplash.com/photo-1702573848697-9f21d2d74049?q=80&w=1888&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D"
        Picasso.get().load(imageUrl).into(image)
    }
}