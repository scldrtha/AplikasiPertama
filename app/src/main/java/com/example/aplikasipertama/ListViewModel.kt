package com.example.aplikasipertama

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

enum class LayoutState {
    LINEAR,
    GRID
}
class ListViewModel : ViewModel() {
    private val _layoutState = MutableLiveData<LayoutState>(LayoutState.LINEAR)

    val layoutState: LiveData<LayoutState>
        get() = _layoutState

    fun changeLayout() {
        if (layoutState.value == LayoutState.LINEAR) {
            _layoutState.value = LayoutState.GRID
        } else  {
            _layoutState.value = LayoutState.LINEAR
        }
    }
}