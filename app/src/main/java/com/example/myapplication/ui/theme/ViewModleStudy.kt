package com.example.myapplication.ui.theme

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn

class MainViewModel : ViewModel() {

    private val textValue = MutableLiveData<String>()

    fun updateText(value: String) {
        textValue.value = value
    }
    val projects = Pager(PagingConfig(pageSize = 20)){
        ProjectPagingSource(Repository)
    }.flow.cachedIn(viewModelScope)
}
