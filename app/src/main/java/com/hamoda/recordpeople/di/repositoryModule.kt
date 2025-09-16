package com.hamoda.recordpeople.di

import com.hamoda.recordpeople.data.repository.UserRepositoryImpl
import com.hamoda.recordpeople.domain.repository.UserRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<UserRepository> { UserRepositoryImpl(get()) }
}