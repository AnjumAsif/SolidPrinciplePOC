package com.example.solidprincipledemo.i.good

import android.widget.EditText

interface TextWatcherWithInstance {
    fun onTextChanged(editText: EditText, s: CharSequence, start: Int, before: Int, count: Int)
}