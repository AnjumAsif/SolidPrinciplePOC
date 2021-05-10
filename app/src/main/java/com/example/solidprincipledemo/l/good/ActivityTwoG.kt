package com.example.solidprincipledemo.l.good

class ActivityTwoG : ClickListenerG {
    override fun onClick() {
        incrementClickCount();
    }

    private fun incrementClickCount() {
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