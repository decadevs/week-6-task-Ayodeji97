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

//    @Test
//    fun `contact length less than 10 or greater than 13` () {
//        val result = CountryNumberValidation.validateNameLength(
//            "1"
//        )
//    }

//    @Test
//    fun `empty name or username or password return false` () {
//        val result = CountryNumberValidation.validatePhoneNumber("08064816696")
//
//        assertThat(result).isFalse()
//    }
//
//    @Test
//    fun `phone number not starting with 234 return false` () {
//        val result = CountryNumberValidation.validateNameLength(
//            "Daniel",
//            "Danny",
//            ""
//
//
//        )
//        assertThat(result).isFalse()
//    }
//
//    @Test
//    fun `phone number not start with 0 return false` () {
//        val result = CountryNumberValidation.validateRegistrationInput(
//            "Daniel",
//            "Danny",
//            "123",
//              "70648166960"
//        )
//
//        assertThat(result).isFalse()
//    }
//
//    @Test
//    fun `phone number is less than 11 return false` () {
//        val result = CountryNumberValidation.validateRegistrationInput(
//
//            "Daniel",
//            "Danny",
//            "123",
//            "080648166",
//        )
//
//        assertThat(result).isFalse()
//    }
//
//    @Test
//    fun `phone number is greater than 13 return false` () {
//        val result = CountryNumberValidation.validateRegistrationInput(
//
//            "Daniel",
//            "Danny",
//            "123",
//            "080648166456732"
//
//        )
//        assertThat(result).isFalse()
//    }
//
//    @Test
//    fun `name and username is less than 3 and 2 respectively return false` () {
//        val result = CountryNumberValidation.validateRegistrationInput(
//            "Da",
//            "D",
//            "123",
//            "080648166456732"
//        )
//
//        assertThat(result).isFalse()
//    }
//


}