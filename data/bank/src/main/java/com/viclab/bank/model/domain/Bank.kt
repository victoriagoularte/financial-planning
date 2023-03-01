package com.viclab.bank.model.domain

data class Bank(
    val id: Long = 0,
    val name: String,
    val code: Long,
    val balance: Double,
)
