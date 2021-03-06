package com.example.unittestingsample.activities.main.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import com.example.unittestingsample.activities.main.viewModel.ItemViewModel
import com.example.unittestingsample.activities.main.viewModel.LoginViewModel
import com.example.unittestingsample.util.Constants

/**
 * author Niharika Arora
 */

val itemModule = module {
    viewModel {
        ItemViewModel(
            get()
        )

    }


    viewModel {
        LoginViewModel(
            get()
        )
    }

}