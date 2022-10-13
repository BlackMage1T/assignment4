package unj.cs.hw4.ui.home

import android.graphics.Path.Direction
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import unj.cs.hw4.Coffee
import unj.cs.hw4.databinding.FragmentDashboardBinding
import unj.cs.hw4.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private lateinit var name: TextView
    private lateinit var coffee: Coffee

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        name.setOnClickListener {
            val img = coffee.img
            val cofName = coffee.coffee
            val lng = coffee.lng
            val action = HomeFragmentDirections.actionNavigationHomeToNavigationDashboard(img, cofName,lng)
            findNavController().navigate(action)
        }

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}