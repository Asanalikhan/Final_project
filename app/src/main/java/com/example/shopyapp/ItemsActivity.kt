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
        items.add(Item(4, "https://www.cielo.co.za/139846-large_default/hawker-leather-egg-chair-spitfire-edition.jpg", "Chair", "Hawker Leather Egg Chair", "Cocoon yourself in the bold embrace of the iconic Hawker Egg Chair – Spitfire Edition. This modern rendition of the mid-century classic features luxurious vintage full grain leather upholstery wrapped in riveted aluminium panels replicating the famed Spitfire fighter plane. A tilt and swivel steel base completes this daring and timeless design—an irresistible statement piece to take your space to a whole new level. ", 249))
        items.add(Item(5, "https://www.apple.com/newsroom/images/product/mac/standard/Apple-MacBook-Air-and-MacBook-Pro-update-wallpaper-screen-070919_big.jpg.large.jpg", "Macbook", "University students Can Purchase", "University students Can Purchase MacBook Air for a lower recommended retail price of AU$1,549 inc. GST and the 13-inch MacBook Pro for RRP AU$1,849 inc. GST", 999))

        itemsList.layoutManager = LinearLayoutManager(this)
        itemsList.adapter = ItemsAdapter(items, this)
    }
}