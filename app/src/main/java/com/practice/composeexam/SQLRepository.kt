package com.practice.composeexam

import android.util.Log

class SQLRepository : UserRepository {

    override fun saveUser(email: String, password: String) {
        Log.d("Compoa UserRepository", "User saved SQL")
    }
}