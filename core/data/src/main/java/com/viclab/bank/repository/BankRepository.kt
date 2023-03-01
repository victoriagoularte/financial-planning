package com.viclab.bank.repository

import com.viclab.model.data.Bank
import kotlinx.coroutines.flow.Flow

interface BankRepository {
    fun getBankByCode(code: Long) : Flow<Bank?>
    fun insert(bank: Bank) : Flow<Unit>
}