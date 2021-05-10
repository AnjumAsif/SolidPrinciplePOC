package com.example.solidprincipledemo.d.bad

class JobTracker(var phone: Phone,var emailer: Emailer){
    /*
 * Based on the jobDescription, the alert is sent
 * This logic should not be implemented here!
 */
    fun setCurrentConditions(jobDescription:String){
        if ("urgent" == jobDescription)
        {
            val alert = phone.generateJobAlert(jobDescription)
            print(alert)
        }
        if ("brief" == jobDescription) {
            val alert = emailer.generateJobAlert(jobDescription)
            print(alert)
        }
    }

}