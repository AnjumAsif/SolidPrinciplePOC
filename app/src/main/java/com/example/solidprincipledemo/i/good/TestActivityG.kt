package com.example.solidprincipledemo.i.good

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import com.example.solidprincipledemo.R
import kotlinx.android.synthetic.main.activity_test.*
import com.example.solidprincipledemo.i.good.TextWatcherWithInstance



class TestActivityG : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)
        val obj=MultiTextWatcher().registerEditText(editText).setCallBack(object : TextWatcherWithInstance {
            override fun onTextChanged(editText: EditText, s: CharSequence, start: Int, before: Int, count: Int) {
                //handle code
            }
        })
    }

}
