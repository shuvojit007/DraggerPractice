package com.shuvojit007.draggerpractice.DI;

import com.shuvojit007.draggerpractice.ui.Auth.AuthActivity;
import com.shuvojit007.draggerpractice.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;



/**
 * Note: Every Activity which extends DaggerActivity will need to be annotated like that.
 * We should also create such a component for every type of Android framework classes
 * we are using for dependency injection in our project (like Fragment, IntentService,
 * BroadcastReceiver etc)
 *
 * @Link: https://android.jlelse.eu/why-and-how-you-should-switch-to-dagger-2-12-ba32aac44300
 */

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector
    abstract AuthActivity contributeAuthActivity();


    @ContributesAndroidInjector
    abstract MainActivity contributeMainActivity();



}
