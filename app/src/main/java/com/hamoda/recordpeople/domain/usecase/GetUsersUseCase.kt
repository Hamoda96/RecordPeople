package com.hamoda.recordpeople.domain.usecase

import com.hamoda.recordpeople.domain.model.User
import com.hamoda.recordpeople.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow

// Use case for retrieving all users from the repository.
// Returns a Flow stream of user lists.
class GetUsersUseCase(
    private val repository: UserRepository
) {
    // Invokes the get all users operation and returns a Flow of users.
    operator fun invoke(): Flow<List<User>> {
        return repository.getAllUsers()
    }
}