package com.example.unscramble

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.unscramble.data.TambahKata


@Database(entities = [TambahKata::class], version = 1)
abstract class AppDatabase : RoomDatabase(){

    abstract fun kataDao ():TambahKataDao

    companion object{

        @Volatile
        var INSTANCE : AppDatabase? = null

        fun getInstance(applicationContext: Context): AppDatabase{

            return INSTANCE ?: synchronized(this) {
                Room.databaseBuilder(
                    applicationContext,
                    AppDatabase::class.java, "database-unscramble"
                ).build().also {
                    INSTANCE = it
                }
            }

        }

    }
}



