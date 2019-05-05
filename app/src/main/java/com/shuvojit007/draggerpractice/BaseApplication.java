package com.shuvojit007.draggerpractice;



import android.util.Log;

import com.shuvojit007.draggerpractice.DI.AppComponent;
import com.shuvojit007.draggerpractice.DI.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;


public class BaseApplication extends DaggerApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("Shuvojit", "onCreate: test logd");
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        AppComponent appComponent = DaggerAppComponent.builder().application(this).build();
        appComponent.inject(this);
        return appComponent;
    }
}
