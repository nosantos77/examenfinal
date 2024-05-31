package com.jalfaro.semana12.database.dao
import androidx.room.Database
import androidx.room.RoomDatabase
import com.jalfaro.semana12.Operacion

@Database(entities = [Operacion::class], version = 1)
abstract class peracionDatabase : RoomDatabase() {
    abstract fun operacionDao(): OperacionDao
}
