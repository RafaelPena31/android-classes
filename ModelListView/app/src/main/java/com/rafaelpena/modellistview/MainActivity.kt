package com.rafaelpena.modellistview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import com.rafaelpena.modellistview.adapter.ProductAdapter
import com.rafaelpena.modellistview.helper.ProductHelper

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val productList = ProductHelper().loadCompleteProducts()

        val listview = findViewById<ListView>(R.id.listView)
        val adapterList = ProductAdapter(this, productList)
        listview.adapter = adapterList

        listview.setOnItemClickListener { adapterView, view, i, l ->
            val instanceIntent = Intent(this, DetailActivity::class.java)
            instanceIntent.putExtra("productName", productList[i].Name)
            instanceIntent.putExtra("productDescription", productList[i].Description)
            instanceIntent.putExtra("productPrice", view.findViewById<TextView>(R.id.textPrice).text)

            startActivity(instanceIntent)
        }
    }
}

