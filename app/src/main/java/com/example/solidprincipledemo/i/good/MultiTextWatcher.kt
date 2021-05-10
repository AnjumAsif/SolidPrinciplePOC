package com.example.solidprincipledemo.i.good

import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
/* We create a custom class called MultiTextWatcher.
   * And pass the interface here
   */
class MultiTextWatcher {
    private var textWatcherWithInstance: TextWatcherWithInstance = null!!

  public  fun setCallBack(callBack: TextWatcherWithInstance): MultiTextWatcher {
        this.textWatcherWithInstance = callBack;
        return this;
    }

    fun registerEditText(editText: EditText): MultiTextWatcher {
        editText.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

        })
        return this
    }
}