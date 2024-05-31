package com.jalfaro.semana12.database.dao

import androidx.room.*
import com.jalfaro.semana12.Operacion

@Dao
interface OperacionDao {
    @Insert
    suspend fun insert(operacion: Operacion)

    @Query("SELECT * FROM operaciones")
    suspend fun getAllOperaciones(): List<Operacion>

    @Delete
    suspend fun delete(operacion: Operacion)
}
