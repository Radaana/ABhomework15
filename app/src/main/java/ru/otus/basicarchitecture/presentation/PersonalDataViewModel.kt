package ru.otus.basicarchitecture.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject
import ru.otus.basicarchitecture.data.WizardCache

class PersonalDataViewModel @Inject constructor(private val wizardCache: WizardCache) : ViewModel() {
    val name = MutableLiveData<String>()
    val surname = MutableLiveData<String>()
    val date = MutableLiveData<Long>()


     fun saveToCash() {
        wizardCache.name = name.value ?: ""
        wizardCache.surname = surname.value ?: ""
        wizardCache.birthDate = date.value ?: 0
    }
}