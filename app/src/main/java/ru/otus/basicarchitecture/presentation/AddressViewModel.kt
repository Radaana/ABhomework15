package ru.otus.basicarchitecture.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.otus.basicarchitecture.data.WizardCache
import javax.inject.Inject

class AddressViewModel @Inject constructor(private val wizardCache: WizardCache) : ViewModel() {
    val country = MutableLiveData<String>()
    val city = MutableLiveData<String>()
    val address = MutableLiveData<String>()


    fun saveToCash() {
        wizardCache.country = country.value ?: ""
        wizardCache.city = city.value ?: ""
        wizardCache.address = address.value ?: ""
    }
}