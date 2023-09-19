package com.example.day20_ecommerce_app.windows

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.WindowInsetsControllerCompat
import com.example.day20_ecommerce_app.adapter.OrderListAdapter
import com.example.day20_ecommerce_app.data.Product
import com.example.day20_ecommerce_app.data.productListFruits
import com.example.day20_ecommerce_app.databinding.ActivityDetailsPageBinding

class DetailsPage : AppCompatActivity() {

    private lateinit var binding : ActivityDetailsPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailsPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val index = intent.getIntExtra("index", 0)
        val product = productListFruits[index]

        binding.ibOrders.setOnClickListener {
            startActivity(Intent(this, OrderPage::class.java))
        }

        setUpData(binding, product)

        window.statusBarColor = (Color.parseColor("#FFFFFF"))
        WindowInsetsControllerCompat(window, window.decorView).isAppearanceLightStatusBars = true
    }

    @SuppressLint("SetTextI18n")
    private fun setUpData(binding: ActivityDetailsPageBinding, product: Product) {
        binding.tvPrice.text = "$ ${product.price}"
        binding.tvOrigin.text = product.origin
        binding.ivProductImage.setImageResource(product.imageId)
        binding.tvProductName.text = product.productName
    }
}