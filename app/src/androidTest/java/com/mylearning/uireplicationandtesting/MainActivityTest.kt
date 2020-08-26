package com.mylearning.uireplicationandtesting

import androidx.lifecycle.Lifecycle
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.intent.Intents.intended
import androidx.test.espresso.intent.matcher.IntentMatchers.hasExtra
import androidx.test.espresso.intent.matcher.IntentMatchers.toPackage
import androidx.test.espresso.intent.rule.IntentsTestRule
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.hamcrest.core.AllOf.allOf
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest {

    @Test
    fun test_isActivityInView() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.parent_form_activity)).check((matches(isDisplayed())))

    }

    @Test
    fun test_visibility_all_widget() {

        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.tvRegisterHeadingTop))
            .check(matches((isDisplayed())))

        onView(withId(R.id.tvRegistrationHeading))
            .check(matches((isDisplayed())))

        onView(withId(R.id.etFullName))
            .check(matches((isDisplayed())))

        onView(withId(R.id.etEmail))
            .check(matches((isDisplayed())))

        onView(withId(R.id.etPassword))
            .check(matches((isDisplayed())))

        onView(withId(R.id.spGender))
            .check(matches(isDisplayed()))
        onView(withId(R.id.btnRegistration))
            .check(matches((isDisplayed())))

        onView(withId(R.id.tvTerms))
            .check(matches((isDisplayed())))

    }

    // Text test
    @Test
    fun test_allWidgetTextDisplay() {

        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.tvRegistrationHeading))
            .check(matches(withText("Registration Form")))

        onView(withId(R.id.tvRegisterHeadingTop))
            .check(matches(withText("Register")))

        onView(withId(R.id.tvTerms))
            .check(matches(withText("By clicking 'Register' You agree\n    to our terms and conditions")))
    }

    @Test
    fun test_navProfilePage() {

        val activityScenario = ActivityScenario.launch(MainActivity::class.java)

        onView(withId(R.id.etFullName)).perform(typeText("Daniel Ayodeji"), closeSoftKeyboard())

        onView(withId(R.id.etPhoneNumber)).perform(typeText("2348064816696"), closeSoftKeyboard())

        onView(withId(R.id.etEmail)).perform(typeText("danielayodeji@gmail.com"), closeSoftKeyboard())

        onView(withId(R.id.etPassword)).perform(typeText("123456"), closeSoftKeyboard())


        onView(withId(R.id.btnRegistration)).perform(click())


    }



}