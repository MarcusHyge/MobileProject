package com.example.myapplication2.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Player::class], version = 1)
abstract class db : RoomDatabase() {
    abstract fun PlayerScoreDao(): PlayerScoreDao

    companion object {
        /* For Singleton instantiation */
        @Volatile
        private var dbInstance: db? = null

        /**
         * @brief getInstance gets the database that holds local high score information
         */
        fun getInstance(context: Context): db {
            return dbInstance ?: synchronized(this) {
                dbInstance ?: buildDatabase(context).also { dbInstance = it }
            }
        }


        /* Used to create database for first time use */
        private fun buildDatabase(context: Context): db {
            return Room.databaseBuilder(context, db::class.java, "player.db").build()
        }
    }
}




