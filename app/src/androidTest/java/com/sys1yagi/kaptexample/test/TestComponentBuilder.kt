package com.sys1yagi.kaptexample.test

import com.sys1yagi.kaptexample.InjectTest
import com.sys1yagi.kaptexample.dagger2.AppModule

public class TestComponentBuilder {
    companion object {
        public fun build(module: AppModule): InjectTest.TestComponent? {
            //can't ganerate DaggerInjectTest_TestComponent
            return null
        }
    }
}
