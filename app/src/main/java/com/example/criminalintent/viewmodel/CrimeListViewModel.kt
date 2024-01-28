package com.example.criminalintent.viewmodel

import androidx.lifecycle.ViewModel
import com.example.criminalintent.repo.CrimeRepository

class CrimeListViewModel : ViewModel() {
	private val crimeRepository = CrimeRepository.get()
	val crimeListLiveData = crimeRepository.getCrimes()
}
