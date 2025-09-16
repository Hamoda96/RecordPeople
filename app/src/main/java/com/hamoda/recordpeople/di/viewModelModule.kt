package com.hamoda.recordpeople.di

import com.hamoda.recordpeople.presentation.user.UserViewModel
import com.hamoda.recordpeople.presentation.users.UsersViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { UserViewModel(get()) }
    viewModel { UsersViewModel(get()) }
}