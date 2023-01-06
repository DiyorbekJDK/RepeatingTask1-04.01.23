package com.diyorbek.repeatingtask1_040123

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.diyorbek.repeatingtask1_040123.databinding.ActivityNewBinding
import com.google.android.material.navigation.NavigationView

class NewActivity : AppCompatActivity() {
    private lateinit var appBarConfiguration: AppBarConfiguration
    private val binding by lazy { ActivityNewBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.hide()
        setSupportActionBar(binding.appBarMain.toolBar)

        val navView: NavigationView = binding.navDrawView
        val navController = findNavController(R.id.nav_fragment)
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.homeFragment, R.id.searchFragment, R.id.favouriteFragment, R.id.historyFragment
            ),
            binding.drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        binding.appBarMain.contentMain.bottomNav.setupWithNavController(navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_fragment)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }
}