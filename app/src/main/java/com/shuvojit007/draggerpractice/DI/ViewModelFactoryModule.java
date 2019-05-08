package com.shuvojit007.draggerpractice.DI;


import androidx.lifecycle.ViewModelProvider;

import com.shuvojit007.draggerpractice.viewmodels.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory viewModelFactory);

}