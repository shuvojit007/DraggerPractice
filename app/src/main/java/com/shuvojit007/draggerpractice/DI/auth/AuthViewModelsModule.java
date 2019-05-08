package com.shuvojit007.draggerpractice.DI.auth;

import androidx.lifecycle.ViewModel;

import com.shuvojit007.draggerpractice.DI.ViewModelKey;
import com.shuvojit007.draggerpractice.ui.Auth.AuthViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class AuthViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel.class)
    public abstract ViewModel bindAuthViewModel(AuthViewModel viewModel);
}