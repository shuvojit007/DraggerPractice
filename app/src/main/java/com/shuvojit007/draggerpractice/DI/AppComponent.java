package com.shuvojit007.draggerpractice.DI;

import android.app.Application;

import com.shuvojit007.draggerpractice.BaseApplication;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjection;
import dagger.android.support.AndroidSupportInjectionModule;


/**
 * Android apps have one application class.
 * That is why we have one application component.
 * This component is responsible for providing
 * application scope instances (eg. OkHttp, Database, SharedPrefs.).
 * This Component is root of our dagger graph.
 * Application component is providing 3 module in our app
 * <p>
 * <p>
 * AndroidInjectionModule : We didn’t create this. It is an internal class in Dagger 2.10.
 * Provides our activities and fragments with given module.
 **/


/**
 * @Singleton ensure a single instance of a class globally.
 *
 * @Component: Component is a graph. We build a component.
 * Component will provide injected instances by using modules.
 *
 * @AndroidInjectionModule : We didn’t create this. It is an internal class in Dagger 2.10.
 * Provides our activities and fragments with given module.
 */
@Singleton
@Component(modules = {
        AndroidSupportInjectionModule.class,
        ActivityBuildersModule.class,
        AppModule.class,
})
public interface AppComponent extends AndroidInjector<BaseApplication> {

    /**
     * @Component.Builder: We might want to bind some instance to Component.
     * In this case we can create an interface with @Component.Builder annotation
     * and add whatever method we want to add to builder.
     * In my case I wanted to add Application to my AppComponent.
     *
     *
     * we are annotating that this interface will be responsible for our generated
     * builder which will have methods responsible for retrieving our application class
     * and building whole component together.
     *
     * @BindsInstance means that this method will also inject our Application class to the
     * component so we will be able to use it there. And that’s it.
     *
     * Note: If you want to create a Builder for your Component,
     * your Builder interface has to has a build(); method which returns your Component.
     **/
    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(Application application);

        AppComponent build();
    }

}
