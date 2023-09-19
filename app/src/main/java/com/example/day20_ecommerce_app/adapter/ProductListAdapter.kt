package com.example.day20_ecommerce_app.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.day20_ecommerce_app.data.Product
import com.example.day20_ecommerce_app.databinding.ProductItemviewBinding

class ProductListAdapter(private val listOfProducts : List<Product>) :
    RecyclerView.Adapter<ProductListAdapter.ViewHolder>(){

    private var onClickListener: OnClickListener? = null

    class ViewHolder(binding: ProductItemviewBinding) : RecyclerView.ViewHolder(binding.root) {
        val productImage = binding.ivProduct
        val productName = binding.tvProductName
        val productPrice = binding.tvPrice
        val productOrigin = binding.tvOrigin
        val productCard = binding.productCardview
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ProductItemviewBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        ))
    }

    override fun getItemCount(): Int {
        return listOfProducts.size
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val product = listOfProducts[position]

        holder.productImage.setImageResource(product.imageId)
        holder.productName.text = product.productName
        holder.productPrice.text = "$ ${product.price}"
        holder.productOrigin.text = product.origin

        holder.productCard.setOnClickListener {
            if(onClickListener != null){
                onClickListener?.onClick(position)
            }
        }
    }

    fun setOnClickListener(onClickListener: OnClickListener) {
        this.onClickListener = onClickListener
    }

    interface OnClickListener{
        fun onClick(index: Int)
    }
}