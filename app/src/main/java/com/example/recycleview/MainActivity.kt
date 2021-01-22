package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recycleView:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        recycleView.findViewById(R.id.recyclerView)
        val productList=ArrayList<Product>()
        productList.add(Product(1,"Place","ადგილი",R.drawable.ggggg,true))
        productList.add(Product(2,"Place2","ადგილი2",R.drawable.ew,true))
        productList.add(Product(3,"Place3","ადგილი3",R.drawable.ewq,true))
        val adapter=ProductAdapter(productList)
        recycleView.layoutManager=GridLayoutManager(this,2)
        recycleView.adapter=adapter




    }
}