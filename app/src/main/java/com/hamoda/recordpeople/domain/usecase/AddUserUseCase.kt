package com.hamoda.recordpeople.domain.usecase

import com.hamoda.recordpeople.domain.model.User
import com.hamoda.recordpeople.domain.repository.UserRepository

// Use case for adding a user to the repository.
// Calls the repository to insert a new user.
class AddUserUseCase(
    private val repository: UserRepository
) {
    // Invokes the add user operation asynchronously.
    suspend operator fun invoke(user: User) {
        repository.addUser(user)
    }
}