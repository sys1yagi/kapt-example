package com.sys1yagi.kaptexample.dagger2

import com.sys1yagi.kaptexample.MainActivity

import dagger.Component
import javax.inject.Singleton

Singleton
Component(modules = arrayOf(javaClass<AppModule>()))
public trait AppComponent {
    public fun inject(target: MainActivity)
}
