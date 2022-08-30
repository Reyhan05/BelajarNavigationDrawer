package com.reyhan.belajarnavdrawer.ui.android

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AndroidViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "Android"
    }
    val text: LiveData<String> = _text
}
