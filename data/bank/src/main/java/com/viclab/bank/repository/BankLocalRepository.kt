package com.viclab.bank.repository

import com.viclab.bank.model.domain.Bank
import com.viclab.bank.model.local.BankEntity
import kotlinx.coroutines.flow.Flow

interface BankLocalRepository {
    fun getBankByCode(code: Long) : Flow<Bank?>
    fun insert(bank: Bank) : Flow<Unit>
}