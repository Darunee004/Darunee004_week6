package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var recycleView : RecyclerView? = null
    var foodMenuText = arrayOf(
        "ขนมบุหลันดั้นเมฆ",
        "ขนมชั้น",
        "ขนมจ่ามงกุฎ",
        "ขนมเสน่ห์จันทร์",
        "ขนมวุ้นลูกชุบ",
        "ขนมกลีบลำดวน",
        "ขนมกระเช้าสีดา",
        "ขนมสัมปันนี",
        "ขนมน้ำดอกไม้",
        "ช่อม่วงอัญชัน",
        "ขนมลืมกลืน",
        "ขนมหน้าไข่",
        "ขนมก้านบัว"
    )
    var foodMenuImage = arrayOf<Int>(
        R.drawable.image1,
        R.drawable.image2,
        R.drawable.image3,
        R.drawable.image4,
        R.drawable.image5,
        R.drawable.image6,
        R.drawable.image7,
        R.drawable.image8,
        R.drawable.image9,
        R.drawable.image10,
        R.drawable.image11,
        R.drawable.image12,
        R.drawable.image13
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setTitle("ร้านขนมไทย")
        recycleView = findViewById(R.id.menuRecyclerview) as RecyclerView
        recycleView!!.layoutManager = LinearLayoutManager(this)
        recycleView!!.setLayoutManager(GridLayoutManager(this, 2))
        var myAdapter = MyAdapterRecycleView(foodMenuText,foodMenuImage,this)
        recycleView!!.setAdapter(myAdapter)

    }
}
