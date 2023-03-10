package com.viclab.account

import com.viclab.account.dao.AccountDao
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
    ): AccountDao = database.bankDao()
}