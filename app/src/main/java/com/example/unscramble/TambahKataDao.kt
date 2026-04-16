package com.example.unscramble

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.unscramble.data.GameHistory


@Dao
interface HistoryDao {

        @Query("SELECT * FROM game_history ORDER BY id DESC")
        suspend fun getAllHistory(): List<GameHistory>

        @Insert
        suspend fun insert(history: GameHistory)


    }

