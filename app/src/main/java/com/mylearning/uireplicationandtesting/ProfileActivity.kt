package com.mylearning.uireplicationandtesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_profile.*

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)


        // onClick Listener to go back to MainActivity
        flBackToHome.setOnClickListener {
            onBackPressed()
        }

        val name = intent.getStringExtra("EXTRA_NAME")
        val contact = intent.getStringExtra("EXTRA_CONTACT" )
        val email = intent.getStringExtra("EXTRA_EMAIL")
        val password = intent.getStringExtra("EXTRA_PASSWORD")
        val userName = intent.getStringExtra("EXTRA_USERNAME")
        val gender = intent.getStringExtra("EXTRA_GENDER")


        // Setting text in to respective edit text
        nameInputSpace.text = name
        tvEmailSpace.text = email
        tvContactSpace.text = contact.toString()
        tvUserNameSpace.text = userName
        tvGenderSpace.text = gender


    }
}