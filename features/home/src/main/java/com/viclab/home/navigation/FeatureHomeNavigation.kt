package com.viclab.home.navigation

import android.content.Context
import android.content.Intent
import com.viclab.home.presentation.HomeActivity
import com.viclab.navigation.home.HomeNavigation
import javax.inject.Inject

class FeatureHomeNavigation @Inject constructor() : HomeNavigation {

    override fun navigateToHome(context: Context) {
        context.startActivity(Intent(context, HomeActivity::class.java))
    }
}