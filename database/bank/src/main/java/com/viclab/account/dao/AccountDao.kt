package com.viclab.account.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.viclab.account.model.AccountEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface AccountDao {
    @Query("SELECT * FROM account")
    fun getAll(): Flow<List<AccountEntity>>

    @Query("SELECT * FROM account WHERE bankCode = :bankCode")
    fun getBankByCode(code: Long): Flow<AccountEntity?>

    @Insert
    suspend fun insert(account: AccountEntity)

    @Delete
    suspend fun delete(account: AccountEntity)
}