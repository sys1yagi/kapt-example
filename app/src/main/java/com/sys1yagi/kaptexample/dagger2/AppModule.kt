package com.sys1yagi.kaptexample.dagger2

import android.content.Context
import com.sys1yagi.kaptexample.tools.EventBus
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

Module
open public class AppModule(val context: Context) {

    Provides
    fun provideContext(): Context {
        return context
    }

    Singleton
    Provides
    open fun provideEventBus(): EventBus {
        return EventBus()
    }
}
