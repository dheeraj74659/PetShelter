package com.example.petshelter.Database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

/**
 * Defines method for using the pets class with the room
 */
@Dao
interface PetsDatabaseDao {

    @Insert
    suspend fun insert(pet: Pets)

    @Update
    suspend fun update(pet: Pets)

    @Query("Delete from pets_table where id = :id")
    suspend fun delete(id: Long)

    @Query("Select * from pets_table order by id")
    fun getAllPets(): LiveData<List<Pets>>

    @Query("select * from pets_table where id = :id")
    fun getPetsById(id: Long): LiveData<Pets>

}