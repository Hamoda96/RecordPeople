package com.hamoda.recordpeople.data.model

import com.hamoda.recordpeople.data.local.UserEntity
import com.hamoda.recordpeople.domain.model.User

/**
 * Maps UserEntity to User domain model.
 */
fun UserEntity.toDomain(): User {
    return User(id = id, name = name, age = age, jobTitle = jobTitle, gender = gender)
}

/**
 * Maps User domain model to UserEntity for database storage.
 */
fun User.toEntity(): UserEntity {
    return UserEntity(id = id, name = name, age = age, jobTitle = jobTitle, gender = gender)
}