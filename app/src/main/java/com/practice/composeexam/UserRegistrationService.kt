package com.practice.composeexam;

import javax.inject.Inject
import javax.inject.Named


class UserRegistrationService @Inject constructor(
    @Named("sql")private val userRepository: UserRepository,
    private val emailService: EmailService
){

    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        emailService.send(email, "", "")
    }
}
