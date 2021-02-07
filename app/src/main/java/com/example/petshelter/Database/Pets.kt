package com.example.petshelter.Database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Represents Pets detail table with the following parameters.
 * @param id : Unique id to be saved in database.
 * @param petsName : The name of the pet.
 * @param petsBreed : Breed of the pet (mostly for dogs).
 * @param petsGender : Gender of the pet.
 * @param petsWeight : weight of the pet.
 */

@Entity(tableName = "pets_table")
data class Pets(

    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,

    @ColumnInfo(name = "pets_name")
    val petsName: String = "",

    @ColumnInfo(name = "pets_breed")
    val petsBreed: String = "",

    @ColumnInfo(name = "pets_gender")
    val petsGender: String = "Unknown",

    @ColumnInfo(name = "pets_weight")
    val petsWeight: Int = 0
)