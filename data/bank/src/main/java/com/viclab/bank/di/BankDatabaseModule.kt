package com.viclab.bank.di

import android.content.Context
import androidx.room.Room
import com.viclab.bank.database.BankDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object BankDatabaseModule {

    @Provides
    fun provideBankDatabase(@ApplicationContext context: Context): BankDatabase {
        return Room.databaseBuilder(context, BankDatabase::class.java, "bank-database").build()
    }
}