package com.viclab.home.di

import com.viclab.home.navigation.HomeNavigationImpl
import com.viclab.navigation.home.HomeNavigation
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
internal abstract class NavigationModule {

  @Binds
  @Singleton
  abstract fun bindNavigation(
    homeNavigationImpl: HomeNavigationImpl
  ): HomeNavigation
}