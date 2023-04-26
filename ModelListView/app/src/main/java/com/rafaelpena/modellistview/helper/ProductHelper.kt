package com.rafaelpena.modellistview.helper

import com.rafaelpena.modellistview.model.Product

class ProductHelper {
    fun loadProducts(): ArrayList<String> {
        val productData = ArrayList<String>()

        productData.add("Xiaomi Redmi Note 9")
        productData.add("Xiaomi Redmi Note 9 Pro")
        productData.add("Samsung Galaxy S20")
        productData.add("Alexa Echo Dot 3")
        productData.add("Alexa Show 5")
        productData.add("Google Chromecast")
        productData.add("Xiaomi Stick")
        productData.add("TV QLed 50 polegadas")
        productData.add("Playstation 5")
        productData.add("X-Box One X")
        productData.add("iPhone 12")
        productData.add("JBL 2")
        productData.add("Macbook Pro 2020")
        productData.add("iPad Pro 2020")
        productData.add("iPhone 14 Pro")
        productData.add("Apple Watch 7 Ultra")
        productData.add("Apple Watch 6")
        productData.add("Apple Watch 3")
        productData.add("iPad 9")
        productData.add("iPad 5")

        return productData
    }

    fun loadCompleteProducts(): ArrayList<Product> {
        val productData = ArrayList<Product>()

        productData.add(Product("Xiaomi Redmi Note 9", "Smartphone 6 GB ram", 1990.10))
        productData.add(Product("Xiaomi Redmi Note 9 Pro", "Versão pro do smartphone da Xiaomi", 2350.20))
        productData.add(Product("Samsung Galaxy S20", "Smartphone de última geração da Samsung", 5520.30))
        productData.add(Product("Alexa Echo Dot 3", "Assistente doméstica", 290.90))
        productData.add(Product("Alexa Show 5", "Assistente doméstica com ecrã touch", 520.99))
        productData.add(Product("Google Chromecast", "Assistente doméstica da Google", 350.00))
        productData.add(Product("Xiaomi Stick", "Android TV portátil", 289.90))
        productData.add(Product("TV QLed 50 polegadas", "Televisão 4k", 2559.99))
        productData.add(Product("Playstation 5", "Console e manete", 4850.00))
        productData.add(Product("X-Box One X", "Console e duas manetes", 5250.00))
        productData.add(Product("iPhone 12", "iPhone Apple com 128GB de memória", 6570.00))
        productData.add(Product("JBL 2", "Caixa de som a prova d'água", 850.00))

        return productData
    }
}