package com.mylearning.uireplicationandtesting


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.Gravity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.etEmail
import kotlinx.android.synthetic.main.activity_main.etFullName
import kotlinx.android.synthetic.main.activity_main.etPassword
import kotlinx.android.synthetic.main.activity_main.etPhoneNumber
import kotlinx.android.synthetic.main.activity_profile.*

open class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRegistration.setOnClickListener {
            val fullName = etFullName.text.toString()
            val userName = etUserName.text.toString()
            val contact = etPhoneNumber.text.toString()
            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString()
            //val gender = rgGenderGroup.text.toString()


            val checkAllFields = CountryNumberValidation(etFullName, etUserName, etPhoneNumber, etEmail, etPassword)

            val inputValidator = CountryNumberValidation.specialFieldValidation(contact, email, password)


            if (checkAllFields != null) {
                checkAllFields.error = "Fields required"
                Toast.makeText(this, "${resources.getResourceEntryName(checkAllFields.id) } is empty", Toast.LENGTH_SHORT).show()
            }
            else if (inputValidator != null) {
                Toast.makeText(this, "${inputValidator} is invalid", Toast.LENGTH_SHORT).show()


            }

            else {

                // Creating intent object
                Intent(this, ProfileActivity::class.java).also {
                    it.putExtra("EXTRA_NAME", fullName)
                    it.putExtra("EXTRA_CONTACT", contact)
                    it.putExtra("EXTRA_EMAIL", email)
                    it.putExtra("EXTRA_PASSWORD", password)
                    it.putExtra("EXTRA_USERNAME", userName)
                  //  it.putExtra("EXTRA_GENDER", gender)

                    startActivity(it)
                }
            }


        }
    }
}