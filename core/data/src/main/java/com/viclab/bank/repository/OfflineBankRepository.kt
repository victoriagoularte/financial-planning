package com.viclab.bank.repository

import com.viclab.bank.datasource.BankLocalDataSource
import com.viclab.bank.model.asBank
import com.viclab.bank.model.asBankEntity
import com.viclab.model.data.Bank
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class OfflineBankRepository @Inject constructor(private val dataSource: BankLocalDataSource) : BankRepository {

    override fun getBankByCode(code: Long) = dataSource.getBankByCode(code).map { it?.asBank() }
    override fun insert(bank: Bank) = dataSource.insert(bank.asBankEntity())
}