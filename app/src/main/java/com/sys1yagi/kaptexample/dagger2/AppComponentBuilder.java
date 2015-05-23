package com.sys1yagi.kaptexample.dagger2;

public class AppComponentBuilder {

    public static AppComponent build(AppModule appModule) {
        return DaggerAppComponent.builder().appModule(appModule).build();
    }
}
