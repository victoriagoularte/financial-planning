package com.viclab.bank.datasource

import com.viclab.bank.dao.BankDao
import com.viclab.bank.model.local.BankEntity
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class BankLocalDataSourceImpl @Inject constructor(private val dataSource: BankDao) : BankLocalDataSource {

    override fun getBankByCode(code: Long) = flow {
            val bank = dataSource.getBankByCode(code)
            emit(bank)
        }

    override fun insert(bank: BankEntity) = flow {
        emit(dataSource.insert(bank))
    }
}