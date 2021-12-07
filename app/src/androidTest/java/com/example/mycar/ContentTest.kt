package com.example.mycar


import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.pressImeActionButton
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ContestTest {

    @get:Rule
    val activityScenarioRule = ActivityScenarioRule(MapsActivity::class.java)

    @Test
    fun useAppContext() {
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.mycar", appContext.packageName)
    }

    @Test
    fun correct_name_shown_at_end_of_flow() {
        onView(withId(R.id.text_box)).check(matches(withText("test")))

    }
}