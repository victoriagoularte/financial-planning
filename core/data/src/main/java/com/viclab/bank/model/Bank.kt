package com.viclab.bank.model

import com.viclab.database.model.BankEntity
import com.viclab.model.data.Bank

fun BankEntity.asBank() = Bank(
    id = id,
    name = name,
    code = code,
    balance = balance
)

fun Bank.asBankEntity() = BankEntity(
    id = id,
    name = name,
    code = code,
    balance = balance
)