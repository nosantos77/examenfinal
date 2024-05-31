package com.jalfaro.semana12.adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.jalfaro.semana12.Operacion
import com.jalfaro.semana12.R

class OperacionAdapter(private val Operacion: List<Operacion>, private val onItemClick: (Operacion) -> Unit) :
    RecyclerView.Adapter<OperacionAdapter.OperacionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OperacionViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_operacion, parent, false)
        return OperacionViewHolder(view)
    }

    override fun onBindViewHolder(holder: OperacionViewHolder, position: Int) {
        val operacion = Operacion[position]
        holder.bind(operacion)
        holder.itemView.setOnClickListener {
            onItemClick(operacion)
        }
    }

    override fun getItemCount(): Int = Operacion.size

    class OperacionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val tvOperando1: TextView = itemView.findViewById(R.id.tvOperando1)
        private val tvOperacion: TextView = itemView.findViewById(R.id.tvOperacion)
        private val tvOperando2: TextView = itemView.findViewById(R.id.tvOperando2)

        fun bind(operacion: Operacion) {
            tvOperando1.text = operacion.operando1.toString()
            tvOperacion.text = operacion.operacion
            tvOperando2.text = operacion.operando2.toString()
        }
    }
}
