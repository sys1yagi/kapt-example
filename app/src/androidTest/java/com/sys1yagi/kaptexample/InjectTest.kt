package com.sys1yagi.kaptexample

import android.content.Context
import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import com.sys1yagi.kaptexample.dagger2.AppModule
import com.sys1yagi.kaptexample.test.TestComponentBuilder
import com.sys1yagi.kaptexample.tools.EventBus
import dagger.Component
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.notNullValue
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito.mock
import javax.inject.Inject
import kotlin.properties.Delegates

RunWith(javaClass<AndroidJUnit4>())
public class InjectTest {

    Component
    public trait TestComponent {
        fun inject(target: InjectTest)
    }

    public class TestModule(context: Context) : AppModule(context) {
        override fun provideEventBus(): EventBus {
            return mock(javaClass<EventBus>())
        }
    }

    var eventBus: EventBus by Delegates.notNull()
    [Inject] set

    Before
    public fun before() {
        TestComponentBuilder
                .build(TestModule(InstrumentationRegistry.getTargetContext()))
                ?.inject(this)
    }

    Test
    public fun test() {
        assertThat(eventBus, `is`(notNullValue()))
    }
}
