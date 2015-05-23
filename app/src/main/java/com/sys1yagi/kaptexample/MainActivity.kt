package com.sys1yagi.kaptexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView
import com.sys1yagi.kaptexample.tools.DeviceInfo
import com.sys1yagi.kaptexample.tools.EventBus
import javax.inject.Inject
import kotlin.properties.Delegates

public class MainActivity : AppCompatActivity() {
    var eventBus: EventBus by Delegates.notNull()
        [Inject] set

    var deviceInfo: DeviceInfo by Delegates.notNull()
        [Inject] set

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Application.graph.inject(this)

        setContentView(R.layout.activity_main)

        val textView = (findViewById(R.id.text) as TextView)
        textView.append(eventBus.toString())
        textView.append("\n")
        textView.append(deviceInfo.toString())
    }

}
