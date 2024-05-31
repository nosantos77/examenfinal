import android.app.Application
import androidx.room.Room
import com.jalfaro.semana12.database.OperacionDatabase

class MyApplication : Application() {
    companion object {
        var database: OperacionDatabase? = null
    }

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(applicationContext, OperacionDatabase::class.java, "operaciones_db").build()
    }
}
