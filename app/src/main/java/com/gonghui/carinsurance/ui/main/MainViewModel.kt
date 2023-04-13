package com.gonghui.carinsurance.ui.main

import android.icu.text.NumberFormat
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var userName = MutableLiveData<String>().apply { value = "ViewModelProvider" }

    fun textClick(){
        userName.value = NumberFormat.getInstance().format(6666666.33)
    }
}