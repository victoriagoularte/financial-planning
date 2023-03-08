package com.viclab.account.datasource

import com.viclab.account.dao.AccountDao
import com.viclab.account.model.AccountEntity
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class AccountLocalDataSourceImpl @Inject constructor(private val bankDao: AccountDao) : AccountLocalDataSource {

    override fun getBankByCode(code: Long) = bankDao.getBankByCode(code)

    override fun insert(bank: AccountEntity) = flow {
        emit(bankDao.insert(bank))
    }
}