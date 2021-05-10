package com.example.solidprincipledemo.d.good

class JobTracker {
    private var currentAlert: String? = null

    fun setCurrentConditions(jobDescription: String) {
        this.currentAlert = jobDescription
    }

    fun notify(notifier: Notifier) {
        notifier.jobAlert(currentAlert!!)
    }
}