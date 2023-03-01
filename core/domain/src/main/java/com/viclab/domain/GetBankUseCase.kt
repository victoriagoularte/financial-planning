package com.viclab.domain

import com.viclab.bank.repository.BankRepository
import javax.inject.Inject

class GetBankUseCase @Inject constructor(private val bankRepository: BankRepository) {

    operator fun invoke(code: Long) = bankRepository.getBankByCode(code)
}