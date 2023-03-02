package com.viclab.bank

import android.content.Context
import androidx.room.Room
import com.viclab.bank.BankDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun providesBankDatabase(@ApplicationContext context: Context): BankDatabase {
        return Room.databaseBuilder(context, BankDatabase::class.java, "bank-database").build()
    }
}