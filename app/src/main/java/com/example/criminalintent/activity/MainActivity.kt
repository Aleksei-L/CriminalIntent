package com.example.criminalintent.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.criminalintent.R
import com.example.criminalintent.fragment.CrimeListFragment

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		val currentFragment = supportFragmentManager.findFragmentById(R.id.fragment_container)

		if (currentFragment == null) {
			val fragment = CrimeListFragment.newInstance()
			supportFragmentManager
				.beginTransaction()
				.add(R.id.fragment_container, fragment)
				.commit()
		}
	}
}
