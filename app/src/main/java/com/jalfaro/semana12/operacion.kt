package com.jalfaro.semana12
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "operaciones")
data class Operacion(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val operando1: Int,
    val operando2: Int,
    val operacion: String
)
