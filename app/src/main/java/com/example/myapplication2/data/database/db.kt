package com.example.myapplication2.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myapplication2.data.database.PlayerScoreDao

@Database(entities = [db::class], version = 1)
abstract class db: RoomDatabase() {
    abstract fun PlayerScoreDao(): PlayerScoreDao
}


