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
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso
import java.io.InputStream
import java.net.URL

class ItemActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item)

        val image: ImageView = findViewById(R.id.item_list_image_one)
        val title: TextView = findViewById(R.id.item_list_title_one)
        val text: TextView = findViewById(R.id.item_list_text)
        val desc: TextView = findViewById(R.id.item_list_desc_one)


        title.text = intent.getStringExtra("itemTitle")
        text.text = intent.getStringExtra("itemText")
        desc.text = intent.getStringExtra("itemDesc")

        val imageId = intent.getStringExtra("itemImage")
        Glide.with(this).load(imageId).into(image)

    }
}