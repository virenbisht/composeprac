package com.practice.composeexam

interface UserRepository {

    fun saveUser(email: String, password: String)
}