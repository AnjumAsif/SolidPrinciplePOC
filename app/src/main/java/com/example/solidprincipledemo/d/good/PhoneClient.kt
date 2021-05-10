package com.example.solidprincipledemo.d.good

class PhoneClient : Notifier {
    override fun jobAlert(jobDescription: String) {
        if (jobDescription == "urgent")
            print("You have urgent message coming from home")
    }
}