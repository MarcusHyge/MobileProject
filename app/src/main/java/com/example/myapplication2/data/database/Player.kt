package com.example.myapplication2.data.database

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Player constructor(
    @PrimaryKey
    @NonNull
    var player_id: String,

    var score: Int = 0,

    var raining : Boolean = false
) {
    override fun toString(): String {
        return "$player_id , $score , $raining"
    }
}

