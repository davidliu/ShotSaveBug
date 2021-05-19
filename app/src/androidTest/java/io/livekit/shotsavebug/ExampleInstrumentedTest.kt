package io.livekit.shotsavebug

import androidx.compose.ui.test.junit4.createComposeRule
import com.karumi.shot.ScreenshotTest
import org.junit.Rule
import org.junit.Test

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleInstrumentedTest : ScreenshotTest {
    @get:Rule
    val composeRule = createComposeRule()

    @Test
    fun renderLoginScreen() {
        composeRule.setContent {
            Greeting("Hello World.")
        }

        compareScreenshot(composeRule)
    }
}