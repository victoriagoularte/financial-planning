package com.viclab.account.datasource

import com.viclab.account.model.AccountEntity
import kotlinx.coroutines.flow.Flow

interface AccountLocalDataSource {
    fun getBankByCode(code: Long) : Flow<AccountEntity?>
    fun insert(bank: AccountEntity) : Flow<Unit>
}