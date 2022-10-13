package unj.cs.hw4

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolder(inflater: LayoutInflater, parent: ViewGroup): RecyclerView.ViewHolder(inflater.inflate(R.layout.coffeelist, parent, false)){

    private var imgView: ImageView = itemView.findViewById(R.id.img)
    private var txtCoffee: TextView = itemView.findViewById(R.id.coffee)
    private var sDesc: TextView = itemView.findViewById(R.id.shrtDesc)
    private var lDesc: TextView = itemView.findViewById(R.id.longDesc)
    private var isFav: Boolean = false

    fun bind(data: Coffee){
        imgView.setImageResource(data.img)
        txtCoffee.text = data.coffee
        sDesc.text = data.shrt
        lDesc.text = data.lng
        isFav = data.fav
    }
}