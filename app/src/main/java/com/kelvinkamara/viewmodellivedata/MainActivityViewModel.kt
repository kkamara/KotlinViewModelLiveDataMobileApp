package com.kelvinkamara.viewmodellivedata

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    var count: Int = 0

    fun updateCount() {
        ++count
    }
}