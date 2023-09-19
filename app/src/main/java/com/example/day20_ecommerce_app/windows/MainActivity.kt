package com.example.day20_ecommerce_app.windows

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.WindowInsetsControllerCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.example.day20_ecommerce_app.adapter.OrderListAdapter
import com.example.day20_ecommerce_app.adapter.ProductListAdapter
import com.example.day20_ecommerce_app.data.Product
import com.example.day20_ecommerce_app.data.SampleOrders
import com.example.day20_ecommerce_app.data.orderHistory
import com.example.day20_ecommerce_app.data.productListFruits
import com.example.day20_ecommerce_app.data.productListMeat
import com.example.day20_ecommerce_app.data.productListSeafood
import com.example.day20_ecommerce_app.data.productListVegetables
import com.example.day20_ecommerce_app.databinding.ActivityMainBinding
import com.example.day20_ecommerce_app.databinding.ActivityOrderPageBinding

//https://www.behance.net/gallery/113834651/The-Big-Grocy-App

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvProductListing.layoutManager = GridLayoutManager(
            this@MainActivity, 2
        )

        binding.ibOrders.setOnClickListener {
            startActivity(Intent(this, OrderPage::class.java))
        }

        window.statusBarColor = (Color.parseColor("#FFFFFF"))
        WindowInsetsControllerCompat(window, window.decorView).isAppearanceLightStatusBars = true

        setupFilterChips(binding)
        setUpProductListing(binding, productListFruits)
    }

    private fun setUpProductListing(
        binding: ActivityMainBinding,
        productListFruits: List<Product>
    ) {

        val adapter = ProductListAdapter(productListFruits)
        adapter.setOnClickListener(object: ProductListAdapter.OnClickListener{
            override fun onClick(index: Int) {
                val intent = Intent(this@MainActivity, DetailsPage::class.java)
                intent.putExtra("index", index)
                startActivity(intent)
            }
        })

        binding.rvProductListing.adapter = adapter
    }

    private fun setupFilterChips(binding: ActivityMainBinding) {
        binding.chipFruits.setOnClickListener {
            setUpProductListing(binding, productListFruits)
        }
        binding.chipVegetables.setOnClickListener {
            setUpProductListing(binding, productListVegetables)
        }
        binding.chipFish.setOnClickListener {
            setUpProductListing(binding, productListSeafood)
        }
        binding.chipMeat.setOnClickListener {
            setUpProductListing(binding, productListMeat)
        }
    }
}