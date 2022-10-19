package unj.cs.hw4.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import unj.cs.hw4.R
import unj.cs.hw4.model.Coffee

class CoffeeAdapter(private val dataset: List<Coffee>, private val context: Context): RecyclerView.Adapter<CoffeeAdapter.CoffeeViewHolder>() {

    class CoffeeViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        var img: ImageView = view.findViewById(R.id.img)
        var coffeeName: TextView = view.findViewById(R.id.coffee)
        var short: TextView = view.findViewById(R.id.shrtDesc)
        var long: TextView = view.findViewById(R.id.longDesc)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoffeeViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.coffeelist, parent, false)
        return CoffeeViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: CoffeeViewHolder, position: Int) {
        val coffee = dataset[position]
        holder.img.setImageResource(R.drawable.ic_launcher_background)
        holder.coffeeName.text = context.resources.getString(coffee.name)
        holder.short.text = context.resources.getString(coffee.sDesc)
        holder.long.text = context.resources.getString(coffee.lDesc)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}