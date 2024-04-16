package com.example.invoicegeneratorrestapi

import org.springframework.web.bind.annotation.*
import java.util.Date

@RestController("/invoices")
class InvoiceController {

    @GetMapping("/{customerId}")
    fun getInvoice(@PathVariable customerId: Long): Invoice {
        return TODO()
    }

    @PostMapping("/{customerId}")
    fun postInvoice(@PathVariable customerId: Long, @RequestParam amount: Double, @RequestParam date: Date): Invoice {
        return TODO()
    }

}