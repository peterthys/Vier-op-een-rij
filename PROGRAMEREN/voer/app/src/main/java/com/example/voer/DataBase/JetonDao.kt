package com.example.voer.DataBase

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface JetonDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addJeton(jeton: Jeton)

    @Query("SELECT * FROM jeton_table")
    fun readAllData(): LiveData<List<Jeton>>

    @Update
    suspend fun updateJeton(jeton: Jeton)
}
