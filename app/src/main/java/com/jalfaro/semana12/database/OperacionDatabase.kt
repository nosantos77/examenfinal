package com.jalfaro.semana12.database
import androidx.room.Database
import androidx.room.RoomDatabase
import com.jalfaro.semana12.Operacion
import com.jalfaro.semana12.database.dao.OperacionDao

@Database(entities = [Operacion::class], version = 1)
abstract class OperacionDatabase : RoomDatabase() {
    abstract fun operacionDao(): OperacionDao
}
