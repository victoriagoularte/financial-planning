package com.viclab.account


import com.viclab.account.repository.AccountRepository
import com.viclab.model.data.Account
import javax.inject.Inject

class InsertAccountUseCase @Inject constructor(private val repository: AccountRepository) {

    operator fun invoke(account: Account) = repository.insert(account)
}