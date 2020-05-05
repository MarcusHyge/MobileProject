package com.example.myapplication2.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import java.util.prefs.Preferences

@Dao

interface PlayerScoreDao {
    @Query("SELECT * FROM Player")
    fun getAll(): List<Player>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(player: Player)
}



