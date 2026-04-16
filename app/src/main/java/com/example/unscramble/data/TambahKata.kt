package com.example.unscramble.data

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "kata")
data class TambahKata (

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val word:String


    )