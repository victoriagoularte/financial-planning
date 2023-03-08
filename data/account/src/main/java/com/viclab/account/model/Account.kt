package com.viclab.account.model

import com.viclab.model.data.Account

fun AccountEntity.asAccount() = Account(
    id = id,
    name = name,
    bankCode = bankCode,
    balance = balance
)

fun Account.asAccountEntity() = AccountEntity(
    id = id,
    name = name,
    bankCode = bankCode,
    balance = balance
)