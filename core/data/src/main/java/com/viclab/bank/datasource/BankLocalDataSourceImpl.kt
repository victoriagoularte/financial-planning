package com.viclab.bank.datasource

import com.viclab.database.dao.BankDao
import com.viclab.database.model.BankEntity
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class BankLocalDataSourceImpl @Inject constructor(private val bankDao: BankDao) : BankLocalDataSource {

    override fun getBankByCode(code: Long) = flow {
            val bank = bankDao.getBankByCode(code)
            emit(bank)
        }

    override fun insert(bank: BankEntity) = flow {
        emit(bankDao.insert(bank))
    }
}