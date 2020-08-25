package com.mylearning.uireplicationandtesting

import androidx.lifecycle.Lifecycle
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class ProfileActivityTest {

    @Test
    fun test_isActivityInView() {
        val activityScenario = ActivityScenario.launch(ProfileActivity::class.java)

        onView(withId(R.id.userProfile)).check(matches(isDisplayed()))
    }

    @Test
    fun test_visibility_all_widget() {
        val activityScenario = ActivityScenario.launch(ProfileActivity::class.java)

        onView(withId(R.id.tvWelcomeText))
            .check(matches(isDisplayed()))

        onView(withId(R.id.nameImageInput))
            .check(matches(isDisplayed()))

        onView(withId(R.id.ivNameImage))
            .check(matches(isDisplayed()))

        onView(withId(R.id.nameInput))
            .check(matches(isDisplayed()))

        onView(withId(R.id.nameInputHeading))
            .check(matches(isDisplayed()))

        onView(withId(R.id.nameInputSpace))
            .check(matches(isDisplayed()))

        onView(withId(R.id.userNameInput))
            .check(matches(isDisplayed()))

        onView(withId(R.id.ivUserName))
            .check(matches(isDisplayed()))

        onView(withId(R.id.tvUserNameHeading))
            .check(matches(isDisplayed()))

        onView(withId(R.id.tvUserNameSpace))
            .check(matches(isDisplayed()))

        onView(withId(R.id.userInput))
            .check(matches(isDisplayed()))

        onView(withId(R.id.ivEmail))
            .check(matches(isDisplayed()))

        onView(withId(R.id.emailInput))
            .check(matches(isDisplayed()))

        onView(withId(R.id.tvUserEmailHeading))
            .check(matches(isDisplayed()))

        onView(withId(R.id.tvEmailSpace))
            .check(matches(isDisplayed()))

        onView(withId(R.id.userContactInput))
            .check(matches(isDisplayed()))

        onView(withId(R.id.ivContact))
            .check(matches(isDisplayed()))

        onView(withId(R.id.contactInput))
            .check(matches(isDisplayed()))

        onView(withId(R.id.tvContactHeading))
            .check(matches(isDisplayed()))

        onView(withId(R.id.tvContactSpace))
            .check(matches(isDisplayed()))

        onView(withId(R.id.userGenderInput))
            .check(matches(isDisplayed()))

        onView(withId(R.id.ivGender))
            .check(matches(isDisplayed()))

        onView(withId(R.id.genderInput))
            .check(matches(isDisplayed()))

        onView(withId(R.id.tvGenderHeading))
            .check(matches(isDisplayed()))

        onView(withId(R.id.tvGenderSpace))
            .check(matches(isDisplayed()))

    }

    @Test
    fun test_all_Widget_Text_Display() {
        val activityScenario = ActivityScenario.launch(ProfileActivity::class.java)

        onView(withId(R.id.tvWelcomeText))
            .check(matches(ViewMatchers.withText("Glad To Have You On Board")))

        onView(withId(R.id.btnBackMainActivity))
            .check(matches(ViewMatchers.withText("Back To Home")))

        onView(withId(R.id.nameInputHeading))
            .check(matches(ViewMatchers.withText("Full Name")))

        onView(withId(R.id.tvUserNameHeading))
            .check(matches(ViewMatchers.withText("Username")))

        onView(withId(R.id.tvUserEmailHeading))
            .check(matches(ViewMatchers.withText("Email Address")))

        onView(withId(R.id.tvContactHeading))
            .check(matches(ViewMatchers.withText("Contact")))

        onView(withId(R.id.tvGenderHeading))
            .check(matches(ViewMatchers.withText("Gender")))

    }

//    @Test
//    fun test_nav_profile_page_back_to_main_page() {
//        val activityScenario = ActivityScenario.launch(ProfileActivity::class.java)
//
//        activityScenario.moveToState(Lifecycle.State.RESUMED)
//
//        onView(withId(R.id.flBackToHome)).perform(click())
//
//        //  checking if the next activity is the view
//        onView(withId(R.id.parent_form_activity)).check(matches(isDisplayed()))
//    }

}