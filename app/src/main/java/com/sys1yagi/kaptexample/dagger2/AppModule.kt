package com.sys1yagi.kaptexample.dagger2

import android.app.Application
import android.content.Context
import com.sys1yagi.kaptexample.tools.EventBus
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

Module
public class AppModule(val application: Application) {

    Provides
    fun provideContext(): Context {
        return application
    }

    Singleton
    Provides
    fun provideEventBus(): EventBus {
        return EventBus()
    }
}
