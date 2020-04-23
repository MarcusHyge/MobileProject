package com.example.myapplication2.data.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.myapplication2.data.database.entity.PlayersScore
import java.util.prefs.Preferences

@Dao

    interface PlayerScoreDao {
        @Query("SELECT * FROM players_score")
        fun getAll(): List<Preferences>
    }

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(word: PlayersScore) {
    }

