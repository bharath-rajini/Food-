package com.example.foodapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationMenu
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private  lateinit var   NavController: NavController;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        NavController =findNavController(R.id.nav_host_controller)
        val appBarConfiguration = AppBarConfiguration(
         setOf(R.id.recipeFragment,
             R.id.favoriteFragment,
             R.id.foodJokeFragment
         )
      )
        bottomNavigationView.setupWithNavController(NavController)
        setupActionBarWithNavController(NavController,appBarConfiguration)

    }

    override fun onSupportNavigateUp(): Boolean {
        return NavController.navigateUp() ||  onSupportNavigateUp()
    }
}