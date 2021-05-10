package com.example.solidprincipledemo.d.good

class EmailClient :Notifier {
    override fun jobAlert(jobDescription: String) {
        if (jobDescription=="brief")
            print("Job description is brief")
    }
}