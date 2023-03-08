package com.viclab.account.repository

import com.viclab.account.datasource.AccountLocalDataSource
import com.viclab.account.model.asAccount
import com.viclab.account.model.asAccountEntity
import com.viclab.model.data.Account
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class OfflineAccountRepository @Inject constructor(private val dataSource: AccountLocalDataSource) : AccountRepository {

    override fun getBankByCode(code: Long) = dataSource.getBankByCode(code).map { it?.asAccount() }
    override fun insert(account: Account) = dataSource.insert(account.asAccountEntity())
}