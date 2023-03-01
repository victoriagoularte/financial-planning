package com.viclab.bank

import androidx.room.Database
import androidx.room.RoomDatabase
import com.viclab.bank.dao.BankDao
import com.viclab.bank.model.BankEntity

@Database(entities = [BankEntity::class], version = 1)
abstract class BankDatabase : RoomDatabase() {
    abstract fun bankDao(): BankDao
}
