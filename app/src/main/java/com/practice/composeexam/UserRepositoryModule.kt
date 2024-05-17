package com.practice.composeexam

import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class UserRepositoryModule {

    @Named("firebase")
    @Provides
    fun getFirebaseRepository(): UserRepository {
        return FirebaseRepository()
    }

    @Named("sql")
    @Provides
    fun getSQLRepository(): UserRepository {
        return SQLRepository()
    }
}