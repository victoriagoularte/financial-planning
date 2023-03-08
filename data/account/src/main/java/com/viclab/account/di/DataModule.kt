package com.viclab.account.di

import com.viclab.account.datasource.AccountLocalDataSource
import com.viclab.account.datasource.AccountLocalDataSourceImpl
import com.viclab.account.repository.AccountRepository
import com.viclab.account.repository.OfflineAccountRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface DataModule {

    @Binds
    fun bindsAccountLocalDataSource(
        bankLocalDataSource: AccountLocalDataSourceImpl
    ): AccountLocalDataSource

    @Binds
    fun bindsAccountRepository(
        accountRepository: OfflineAccountRepository
    ): AccountRepository
}