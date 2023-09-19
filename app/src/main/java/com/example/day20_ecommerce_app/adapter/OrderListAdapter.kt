package com.example.day20_ecommerce_app.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.day20_ecommerce_app.data.SampleOrders
import com.example.day20_ecommerce_app.databinding.OrderListItemviewBinding

class OrderListAdapter(private val listOfOrders : List<SampleOrders>) :
    RecyclerView.Adapter<OrderListAdapter.ViewHolder>(){


    class ViewHolder(binding: OrderListItemviewBinding) : RecyclerView.ViewHolder(binding.root) {
        val productImage = binding.ivProductImage
        val productName = binding.tvProductName
        val productPrice = binding.tvPrice
        val orderDate = binding.tvOrderDate
        val orderStatus = binding.tvOrderState
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(OrderListItemviewBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        ))
    }

    override fun getItemCount(): Int {
        return listOfOrders.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = listOfOrders[position]

        holder.productImage.setImageResource(product.imageId)
        holder.productName.text = product.productName
        holder.productPrice.text = "$ ${product.priceInDollars}"
        holder.orderDate.text = product.date
        holder.orderStatus.text = product.status
    }

}