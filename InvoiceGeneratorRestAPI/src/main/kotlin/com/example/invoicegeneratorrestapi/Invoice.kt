package com.example.invoicegeneratorrestapi

import java.util.*

data class Invoice(
    val customerId: Long,
    val amount: Double,
    val date: Date
)
