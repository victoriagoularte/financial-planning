package com.viclab.home.di

import com.viclab.home.navigation.HomeNavigationImpl
import com.viclab.navigation.home.HomeNavigation
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal abstract class NavigationModule {

  @Binds
  abstract fun bindsHomeNavigation(
    homeNavigationImpl: HomeNavigationImpl
  ): HomeNavigation
}