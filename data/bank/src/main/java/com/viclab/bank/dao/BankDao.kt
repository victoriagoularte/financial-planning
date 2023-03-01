package com.viclab.bank.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.viclab.bank.model.local.BankEntity

@Dao
interface BankDao {
    @Query("SELECT * FROM bank")
    suspend fun getAll(): List<BankEntity>

    @Query("SELECT * FROM bank WHERE code = :code")
    fun getBankByCode(code: Long): BankEntity?

    @Insert
    suspend fun insert(bank: BankEntity)

    @Delete
    suspend fun delete(bank: BankEntity)
}