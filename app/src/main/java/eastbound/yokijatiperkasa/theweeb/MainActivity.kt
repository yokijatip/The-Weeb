package eastbound.yokijatiperkasa.theweeb

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.ismaeldivita.chipnavigation.ChipNavigationBar
import eastbound.yokijatiperkasa.theweeb.databinding.ActivityMainBinding
import eastbound.yokijatiperkasa.theweeb.explore.ExploreFragment
import eastbound.yokijatiperkasa.theweeb.home.HomeFragment
import eastbound.yokijatiperkasa.theweeb.library.LibraryFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private fun fragmentManager(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()

        transaction.replace(R.id.content, fragment, fragment.javaClass.simpleName)
        transaction.commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        fragmentTransaction()


    }

    private fun fragmentTransaction() {
        binding.apply {
            bottomNav.setOnItemSelectedListener(object : ChipNavigationBar.OnItemSelectedListener {
                override fun onItemSelected(id: Int) {
                    when (id) {
                        R.id.nav_home -> fragmentManager(HomeFragment())
                        R.id.nav_explore -> fragmentManager(ExploreFragment())
                        R.id.nav_library -> fragmentManager(LibraryFragment())
                    }
                }

            })
            fragmentManager(HomeFragment.newInstance())
            bottomNav.setItemSelected(R.id.nav_home)
        }
    }
}