package com.example.solidprincipledemo.l.good

class ActivityOneG : ClickListenerG {
    override fun onClick() {
        decrementClickCount();
    }

    private fun decrementClickCount() {
    }
    /*
       * We handle the individual logic inside the overridden methods
       * in the framgents. In the main implementation we should
       * never handle logic
       */
    fun onButtonClick(clickListenerG: ClickListenerG) {
        clickListenerG.onClick()

    }

}