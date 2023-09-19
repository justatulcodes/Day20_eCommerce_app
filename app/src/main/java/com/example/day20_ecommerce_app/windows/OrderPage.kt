package com.example.day20_ecommerce_app.windows

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.WindowInsetsControllerCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.day20_ecommerce_app.adapter.OrderListAdapter
import com.example.day20_ecommerce_app.data.SampleOrders
import com.example.day20_ecommerce_app.data.orderHistory
import com.example.day20_ecommerce_app.databinding.ActivityOrderPageBinding

class OrderPage : AppCompatActivity() {

    private lateinit var binding: ActivityOrderPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityOrderPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvOrderList.layoutManager = LinearLayoutManager(this)


        window.statusBarColor = (Color.parseColor("#FFFFFF"))
        WindowInsetsControllerCompat(window, window.decorView).isAppearanceLightStatusBars = true

        showOrderHistory(binding, orderHistory)

        binding.chipAll.setOnClickListener { showOrderHistory(binding, orderHistory) }
        binding.chipDelivered.setOnClickListener {
            val deliveredOrders = mutableListOf<SampleOrders>()
            for (order in orderHistory){
                if(order.status == "Delivered"){
                    deliveredOrders.add(order)
                }
            }
            showOrderHistory(binding, deliveredOrders)
        }

        binding.chipProcessed.setOnClickListener {
            val processedOrders = mutableListOf<SampleOrders>()
            for (order in orderHistory){
                if(order.status == "Processing"){
                    processedOrders.add(order)
                }
            }
            showOrderHistory(binding, processedOrders)
        }

        binding.chipPending.setOnClickListener {
            val pendingOrders = mutableListOf<SampleOrders>()
            for (order in orderHistory){
                if(order.status == "Pending"){
                    pendingOrders.add(order)
                }
            }
            showOrderHistory(binding, pendingOrders)
        }

    }

    private fun showOrderHistory(binding: ActivityOrderPageBinding, orderHistory: List<SampleOrders>) {
        val adapter = OrderListAdapter(orderHistory)
        binding.rvOrderList.adapter = adapter
    }
}