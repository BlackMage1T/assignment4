package unj.cs.hw4

import android.os.Bundle
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import unj.cs.hw4.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var list: RecyclerView
    lateinit var adapter: MyAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()

        list.layoutManager = LinearLayoutManager(this)
        list.adapter = adapter

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }

    private fun init(){
        list = findViewById(R.id.navigation_home)

        var data = ArrayList<Coffee>()
        var a: Int = 0
        for (i in img){
            data.add(Coffee(img[a],coffee[a],sDesc[a],lDesc[a],fav[a]))
            a+=1
        }

        adapter = MyAdapter(data)
    }

    val img = listOf<Int>(
        R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_background
    )
    val coffee = listOf<String>(
        "kopi1",
        "kopi2",
        "kopi3"
    )
    val sDesc = listOf<String>(
        "pendek1",
        "pendek2",
        "pendek3"
    )
    val lDesc = listOf<String>(
        "long1",
        "long2",
        "long3"
    )
    val fav = listOf<Boolean>(
        false,
        false,
        false
    )
}