package com.viclab.bank

import com.viclab.bank.dao.BankDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DaosModule {

    @Provides
    fun providesBankDao(
        database: BankDatabase,
    ): BankDao = database.bankDao()
}