package com.example.shopyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_items)

        val itemsList: RecyclerView = findViewById(R.id.itemsList)
        val items = arrayListOf<Item>()


        items.add(Item(1, "https://media.designcafe.com/wp-content/uploads/2022/05/08181153/sofa-cum-bed-designs-are-perfect-space-saving-furniture.jpg", "Bed", "for best sleeping", "ADORNEVE Full Size LED Bed Frame", 399))
        items.add(Item(2, "https://t4.ftcdn.net/jpg/02/83/53/27/360_F_283532744_Rbs039ygDyekkcCgXp7n3fwEPfB21tjJ.jpg", "Sofa", "for the best sitting", "Modern Convertible, Memory Foam Sofa", 199))
        items.add(Item(3, "https://hips.hearstapps.com/countryliving/assets/17/27/1499363786-devol-arts-crafts-kitchen-kent-dsc-7190-hdr.jpg", "Kitchen", "the best furniture", "You can buy it with discount", 299))

        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = ItemsAdapter(items, this)
    }
}