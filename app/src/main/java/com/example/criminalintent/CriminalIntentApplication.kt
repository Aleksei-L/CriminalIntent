package com.example.criminalintent

import android.app.Application
import com.example.criminalintent.repo.CrimeRepository

class CriminalIntentApplication : Application() {
	override fun onCreate() {
		super.onCreate()
		CrimeRepository.initialize(this)
	}
}
