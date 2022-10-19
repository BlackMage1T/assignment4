package unj.cs.hw4.data

import unj.cs.hw4.R
import unj.cs.hw4.model.Coffee

class Datasource {
    fun loadCoffee(): List<Coffee>{
        return listOf<Coffee>(
            Coffee((R.drawable.ic_launcher_foreground), R.string.name1, R.string.desc1, R.string.detail1, false),
            Coffee((R.drawable.ic_launcher_foreground), R.string.name2, R.string.desc2, R.string.detail2, false),
            Coffee((R.drawable.ic_launcher_foreground), R.string.name3, R.string.desc3, R.string.detail3, false),
            Coffee((R.drawable.ic_launcher_foreground), R.string.name4, R.string.desc4, R.string.detail4, false),
            Coffee((R.drawable.ic_launcher_foreground), R.string.name5, R.string.desc5, R.string.detail5, false)
        )
    }
}