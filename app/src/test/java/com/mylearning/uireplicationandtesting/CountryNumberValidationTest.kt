package com.mylearning.uireplicationandtesting


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class CountryNumberValidationTest {

    @Test
    fun `field is empty return false` () {
        val result = CountryNumberValidation.fieldsEmpty(
            "",
            "",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `contact not start with 234 or 0 return false` () {
        val result = CountryNumberValidation.notStartWithCountryCode(
            "11123456745"
        )

        assertThat(result).isFalse()
    }

    @Test
    fun `fields not empty`() {

        val result = CountryNumberValidation.specialFieldValidation(
            "2348064816696",
            "daniel",
            "Tuir_2321",

        )

        assertThat(result).isNotEmpty()

    }

    @Test
    fun `validate name and user name length return false when less than 3 ` () {
        val result = CountryNumberValidation.validateNameLength(
            "DA",
            "D"
        )
        assertThat(result).isFalse()

    }

    @Test
    fun `validate phone number not start with 234 or 0 return false`() {
        val result = CountryNumberValidation.validatePhoneNumberStart(
            "11110845683"
        )
        assertThat(result).isFalse()
    }



}