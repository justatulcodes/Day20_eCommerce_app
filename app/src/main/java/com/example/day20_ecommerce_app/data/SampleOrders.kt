package com.example.day20_ecommerce_app.data

import com.example.day20_ecommerce_app.R

class SampleOrders (
    val productName: String,
    val priceInDollars: Float,
    val status: String,
    val date: String,
    val imageId : Int
)

val orderHistory = listOf(
    SampleOrders(
        productName = "Pork Chops (2kg)",
        priceInDollars = 52.25f,
        status = "Processing",
        date = "June 14, 2023",
        imageId = R.drawable.pork
    ),
    SampleOrders(
        productName = "Kiwi",
        priceInDollars = 2.50f,
        status = "Delivered",
        date = "July 5, 2023",
        imageId = R.drawable.kiwi
    ),
    SampleOrders(
        productName = "Tomato",
        priceInDollars = 0.75f,
        status = "Processing",
        date = "July 10, 2023",
        imageId = R.drawable.tomato
    ),
    SampleOrders(
        productName = "Lobster",
        priceInDollars = 25.00f,
        status = "Pending",
        date = "July 15, 2023",
        imageId = R.drawable.lobster
    ),
    SampleOrders(
        productName = "Chicken",
        priceInDollars = 8.50f,
        status = "Delivered",
        date = "July 20, 2023",
        imageId = R.drawable.chicken
    ),
    SampleOrders(
        productName = "Spinach",
        priceInDollars = 1.50f,
        status = "Processing",
        date = "July 25, 2023",
        imageId = R.drawable.spinach
    ),
    SampleOrders(
        productName = "Green Apple",
        priceInDollars = 1.75f,
        status = "Delivered",
        date = "July 30, 2023",
        imageId = R.drawable.green_apple
    ),
    SampleOrders(
        productName = "Beef",
        priceInDollars = 15.00f,
        status = "Pending",
        date = "August 3, 2023",
        imageId = R.drawable.beef
    ),
    SampleOrders(
        productName = "Coconut",
        priceInDollars = 3.00f,
        status = "Processing",
        date = "August 7, 2023",
        imageId = R.drawable.cocunut
    ),
    SampleOrders(
        productName = "Shrimp",
        priceInDollars = 15.00f,
        status = "Delivered",
        date = "August 12, 2023",
        imageId = R.drawable.shrimp
    ),
    SampleOrders(
        productName = "Lime",
        priceInDollars = 1.25f,
        status = "Pending",
        date = "August 17, 2023",
        imageId = R.drawable.lime
    ),
    SampleOrders(
        productName = "Carrot",
        priceInDollars = 1.00f,
        status = "Processing",
        date = "August 21, 2023",
        imageId = R.drawable.carrot
    ),
    SampleOrders(
        productName = "Salmon",
        priceInDollars = 20.00f,
        status = "Delivered",
        date = "August 26, 2023",
        imageId = R.drawable.salmon
    ),
    SampleOrders(
        productName = "Pineapple",
        priceInDollars = 2.75f,
        status = "Pending",
        date = "August 31, 2023",
        imageId = R.drawable.pineapple
    ),
    SampleOrders(
        productName = "Brinjal",
        priceInDollars = 1.25f,
        status = "Processing",
        date = "September 5, 2023",
        imageId = R.drawable.brinjal
    ),
    SampleOrders(
        productName = "Goat Meat",
        priceInDollars = 18.00f,
        status = "Delivered",
        date = "September 10, 2023",
        imageId = R.drawable.goat_meat
    ),
    SampleOrders(
        productName = "Pear",
        priceInDollars = 1.50f,
        status = "Pending",
        date = "September 14, 2023",
        imageId = R.drawable.pear
    ),
    SampleOrders(
        productName = "Potato",
        priceInDollars = 0.80f,
        status = "Processing",
        date = "September 19, 2023",
        imageId = R.drawable.potato
    ),
    SampleOrders(
        productName = "Pork",
        priceInDollars = 12.00f,
        status = "Delivered",
        date = "September 24, 2023",
        imageId = R.drawable.pork
    ),
    SampleOrders(
        productName = "Kiwi",
        priceInDollars = 2.50f,
        status = "Pending",
        date = "September 28, 2023",
        imageId = R.drawable.kiwi
    ),
    SampleOrders(
        productName = "Tomato",
        priceInDollars = 0.75f,
        status = "Processing",
        date = "October 2, 2023",
        imageId = R.drawable.tomato
    ),
    SampleOrders(
        productName = "Lobster",
        priceInDollars = 25.00f,
        status = "Delivered",
        date = "October 7, 2023",
        imageId = R.drawable.lobster
    ),
    SampleOrders(
        productName = "Chicken",
        priceInDollars = 8.50f,
        status = "Pending",
        date = "October 12, 2023",
        imageId = R.drawable.chicken
    ),
    SampleOrders(
        productName = "Spinach",
        priceInDollars = 1.50f,
        status = "Processing",
        date = "October 16, 2023",
        imageId = R.drawable.spinach
    ),
    SampleOrders(
        productName = "Green Apple",
        priceInDollars = 1.75f,
        status = "Delivered",
        date = "October 21, 2023",
        imageId = R.drawable.green_apple
    ),
    SampleOrders(
        productName = "Beef",
        priceInDollars = 15.00f,
        status = "Pending",
        date = "October 25, 2023",
        imageId = R.drawable.beef
    ),
    SampleOrders(
        productName = "Coconut",
        priceInDollars = 3.00f,
        status = "Processing",
        date = "October 29, 2023",
        imageId = R.drawable.cocunut
    ),
    SampleOrders(
        productName = "Shrimp",
        priceInDollars = 15.00f,
        status = "Delivered",
        date = "November 3, 2023",
        imageId = R.drawable.shrimp
    ),
    SampleOrders(
        productName = "Lime",
        priceInDollars = 1.25f,
        status = "Pending",
        date = "November 8, 2023",
        imageId = R.drawable.lime
    ),
    SampleOrders(
        productName = "Carrot",
        priceInDollars = 1.00f,
        status = "Processing",
        date = "November 12, 2023",
        imageId = R.drawable.carrot
    ),
    SampleOrders(
        productName = "Salmon",
        priceInDollars = 20.00f,
        status = "Delivered",
        date = "November 17, 2023",
        imageId = R.drawable.salmon
    ),
    SampleOrders(
        productName = "Pineapple",
        priceInDollars = 2.75f,
        status = "Pending",
        date = "November 22, 2023",
        imageId = R.drawable.pineapple
    )
)
