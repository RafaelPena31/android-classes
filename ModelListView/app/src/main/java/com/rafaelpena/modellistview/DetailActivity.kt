package com.rafaelpena.modellistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val productName = intent.getStringExtra("productName")
        val productDescription = intent.getStringExtra("productDescription")
        val productPrice = intent.getStringExtra("productPrice")

        findViewById<TextView>(R.id.textTitleDetails).text = productName
        findViewById<TextView>(R.id.textDescriptionDetails).text = productDescription
        findViewById<TextView>(R.id.textPriceDetails).text = productPrice

        findViewById<Button>(R.id.button).setOnClickListener {
            finish()
        }
    }
}