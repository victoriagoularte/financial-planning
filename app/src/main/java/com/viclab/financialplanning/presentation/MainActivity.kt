package com.viclab.financialplanning.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.viclab.financialplanning.R
import com.viclab.navigation.home.HomeNavigation
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var navigation: HomeNavigation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.navigateToHome(this)
    }
}