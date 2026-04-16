package com.example.unscramble.data

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "game_history")
data class GameHistory (

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val scoore:Int,
    val played:String


    )