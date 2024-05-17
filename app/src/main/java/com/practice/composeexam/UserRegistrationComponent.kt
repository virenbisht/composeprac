package com.practice.composeexam;

import dagger.Component;

@Component(modules = [UserRepositoryModule::class])
interface UserRegistrationComponent {

    fun getUserRegistrationService(): UserRegistrationService

    fun inject(mainActivity: MainActivity)
}
