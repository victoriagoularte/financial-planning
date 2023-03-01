package com.viclab.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.viclab.database.dao.BankDao
import com.viclab.database.model.BankEntity

@Database(entities = [com.viclab.database.model.BankEntity::class], version = 1)
abstract class BankDatabase : RoomDatabase() {
    abstract fun bankDao(): com.viclab.database.dao.BankDao
}
