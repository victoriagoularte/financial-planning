package com.viclab.bank.di

import com.viclab.bank.datasource.BankLocalDataSource
import com.viclab.bank.datasource.BankLocalDataSourceImpl
import com.viclab.bank.repository.BankRepository
import com.viclab.bank.repository.OfflineBankRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface DataModule {

    @Binds
    fun bindsBankLocalDataSource(
        bankLocalDataSource: BankLocalDataSourceImpl
    ): BankLocalDataSource

    @Binds
    fun bindsBankRepository(
        bankRepository: OfflineBankRepository
    ): BankRepository
}