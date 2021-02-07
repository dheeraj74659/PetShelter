package com.example.petshelter.Database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Pets::class], version = 1, exportSchema = false)
abstract class PetsDatabase : RoomDatabase() {

    abstract val petsDatabaseDao: PetsDatabaseDao

    companion object {

        @Volatile
        private var INSTANCE: PetsDatabase? = null

        fun getInstance(context: Context): PetsDatabase {

            synchronized(this) {
                var instance = INSTANCE

                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        PetsDatabase::class.java,
                        "pets_database"
                    )
                        .fallbackToDestructiveMigration()
                        .build()
                }

                return instance
            }
        }

    }

}