package com.viclab.bank.datasource

import com.viclab.database.model.BankEntity
import kotlinx.coroutines.flow.Flow

interface BankLocalDataSource {
    fun getBankByCode(code: Long) : Flow<BankEntity?>
    fun insert(bank: BankEntity) : Flow<Unit>
}