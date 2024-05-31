import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import com.jalfaro.semana12.Operacion
import com.jalfaro.semana12.R
import com.jalfaro.semana12.database.OperacionDatabase
import com.jalfaro.semana12.database.dao.OperacionDao
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var database: OperacionDatabase
    private lateinit var operacionDao: OperacionDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Crear la instancia de la base de datos
        database = Room.databaseBuilder(applicationContext, OperacionDatabase::class.java, "operaciones_db").build()
        operacionDao = database.operacionDao()

        // Ejemplo de cómo insertar una operación
        lifecycleScope.launch {
            val operacion = Operacion(operando1 = 5, operando2 = 10, operacion = "+")
            operacionDao.insert(operacion)
        }
    }
}
