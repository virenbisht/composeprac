package com.practice.composeexam;

import android.util.Log
import javax.inject.Inject

class FirebaseRepository @Inject constructor() : UserRepository {

    override fun saveUser(email: String, password: String) {
        Log.d("Compoa UserRepository", "User saved")
    }
}
