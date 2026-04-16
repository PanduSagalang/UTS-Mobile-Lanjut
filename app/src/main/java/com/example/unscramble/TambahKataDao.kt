package com.example.unscramble

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.unscramble.data.TambahKata


@Dao
interface TambahKataDao {

        @Query("SELECT * FROM kata")
        suspend fun getAll(): List<TambahKata>

        @Insert
        suspend fun insert(kata: TambahKata)



    }

