package com.example.solidprincipledemo.l.bad

class ActivityTwoB : ClickListenerB {
    override fun onClick() {
    }

    fun incrementClickCount() {

    }

    fun onButtonClick(clickListener: ClickListenerB) {
        // IF we have a requirement where we need to increment the click count in
        // framgent2 but decrement the count in fragment 1
        // we would have to follow something like this, which is bad practice.
        if (clickListener is ActivityOneB) clickListener.decrementClickCount() else if (clickListener is ActivityTwoB) {
            clickListener.incrementClickCount();
        }

        clickListener.onClick();
    }
}