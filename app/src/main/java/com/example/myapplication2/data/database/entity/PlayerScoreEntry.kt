package com.example.myapplication2.data.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "players_score")
data class PlayersScore(
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null,
    @ColumnInfo() var player_id: String,
    @ColumnInfo() var score: Int,
    @ColumnInfo() var Raining : Boolean
)
