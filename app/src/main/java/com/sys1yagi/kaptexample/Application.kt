package com.sys1yagi.kaptexample

import com.sys1yagi.kaptexample.dagger2.AppComponent
import com.sys1yagi.kaptexample.dagger2.AppComponentBuilder
import com.sys1yagi.kaptexample.dagger2.AppModule
import kotlin.platform.platformStatic
import kotlin.properties.Delegates

public class Application : android.app.Application() {

    companion object {
        platformStatic var graph: AppComponent by Delegates.notNull()
    }

    override fun onCreate() {
        super.onCreate()
        graph = AppComponentBuilder.build(AppModule(this))
    }
}
