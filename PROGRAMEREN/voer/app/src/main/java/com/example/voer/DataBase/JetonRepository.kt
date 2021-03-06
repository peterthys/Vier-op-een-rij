package com.example.voer.DataBase

import androidx.lifecycle.LiveData

class JetonRepository(private val jetonDao: JetonDao) {
    var jetonList: LiveData<List<Jeton>> = jetonDao.readAllData()
    suspend fun addJeton(jeton: Jeton) {
        jetonDao.addJeton(jeton)
    }
    suspend fun updateJeton(jeton: Jeton){
        jetonDao.updateJeton(jeton)
    }
}

