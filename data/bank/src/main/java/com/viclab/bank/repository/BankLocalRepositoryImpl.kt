package com.viclab.bank.repository

import com.viclab.bank.datasource.BankLocalDataSource
import com.viclab.bank.model.domain.Bank
import com.viclab.bank.model.local.BankEntity
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class BankLocalRepositoryImpl @Inject constructor(val dataSource: BankLocalDataSource) : BankLocalRepository {

    override fun getBankByCode(code: Long) = dataSource.getBankByCode(code).map { it?.toDomain() }
    override fun insert(bank: Bank) = dataSource.insert(bank.toEntity())
}

fun BankEntity.toDomain() = Bank(
    id = id,
    name = name,
    code = code,
    balance = balance
)

fun Bank.toEntity() = BankEntity(
    id = id,
    name = name,
    code = code,
    balance = balance
)