package com.viclab.account.repository

import com.viclab.model.data.Account
import kotlinx.coroutines.flow.Flow

interface AccountRepository {
    fun getBankByCode(code: Long) : Flow<Account?>
    fun insert(account: Account) : Flow<Unit>
}