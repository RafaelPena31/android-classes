package com.rafaelpena.modellistview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.rafaelpena.modellistview.R
import com.rafaelpena.modellistview.model.Product
import java.text.NumberFormat
import java.util.*
import kotlin.collections.ArrayList

class ProductAdapter (private val context: Context, private val productList: ArrayList<Product>): BaseAdapter() {
    override fun getCount(): Int = productList.size

    override fun getItem(i: Int): Product = productList[i]

    override fun getItemId(i: Int): Long = i.toLong()

    override fun getView(i: Int, view: View?, parent: ViewGroup?): View {
        val productView = view ?: LayoutInflater.from(parent?.context).inflate(R.layout.custom_list_view_cell, parent, false)
        val title = productView.findViewById<TextView>(R.id.textTitle)
        val description = productView.findViewById<TextView>(R.id.textDescription)
        val price = productView.findViewById<TextView>(R.id.textPrice)

        title.text = productList[i].Name
        description.text = productList[i].Description
        price.text = NumberFormat.getCurrencyInstance(Locale("pt", "BR")).format(productList[i].Value)

        return productView
    }
}