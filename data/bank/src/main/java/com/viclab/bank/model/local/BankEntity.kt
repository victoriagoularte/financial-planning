package com.viclab.bank.model.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "bank")
data class BankEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val name: String,
    val code: Long,
    val balance: Double,
)
