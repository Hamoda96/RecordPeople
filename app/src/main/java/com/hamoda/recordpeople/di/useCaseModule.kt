package com.hamoda.recordpeople.di

import com.hamoda.recordpeople.domain.usecase.AddUserUseCase
import com.hamoda.recordpeople.domain.usecase.DeleteAllUsersUseCase
import com.hamoda.recordpeople.domain.usecase.DeleteUserByIdUseCase
import com.hamoda.recordpeople.domain.usecase.GetUsersUseCase
import com.hamoda.recordpeople.domain.usecase.UserUseCases
import org.koin.dsl.module

val useCaseModule = module {
    single {
        UserUseCases(
            addUser = AddUserUseCase(get()),
            getUsers = GetUsersUseCase(get()),
            deleteUserById = DeleteUserByIdUseCase(get()),
            deleteAll = DeleteAllUsersUseCase(get())
        )
    }
}