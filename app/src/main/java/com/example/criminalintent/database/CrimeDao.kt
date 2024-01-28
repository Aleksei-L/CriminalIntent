package com.example.criminalintent.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.example.criminalintent.data.Crime
import java.util.UUID

@Dao
interface CrimeDao {
	@Query("SELECT * FROM crime")
	fun getCrimes(): LiveData<List<Crime>>

	@Query("SELECT * FROM crime WHERE crime.id=(:id)")
	fun getCrime(id: UUID): LiveData<Crime?>
}