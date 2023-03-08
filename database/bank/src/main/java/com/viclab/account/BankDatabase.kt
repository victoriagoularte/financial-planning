package com.viclab.account

import androidx.room.Database
import androidx.room.RoomDatabase
import com.viclab.account.dao.AccountDao
import com.viclab.account.model.AccountEntity

@Database(entities = [AccountEntity::class], version = 1)
abstract class BankDatabase : RoomDatabase() {
    abstract fun bankDao(): AccountDao
}
