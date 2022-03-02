package com.example.myapplication.ui.theme

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    /**
     * 城市名
     */
    private val textValue = MutableLiveData<String>()

    /**
     * 对外单独暴漏修改城市名方法
     */
    fun updateText(value: String) {
        textValue.value = value
    }
}
