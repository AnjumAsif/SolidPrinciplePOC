package com.example.solidprincipledemo.o.bad;

public class TimeOfDayGreeting {
    private String timeOfDay;
    /*  
     * Every time this method is called it will 
     * called an if else logic, which is in violation of the 
     * OCP principle.
     */
     public String getGreetingFromTimeOfDay() {
         switch (this.timeOfDay) {
             case "Morning":
                 return "Good Morning, sir.";
             case "Afternoon":
                 return "Good Afternoon, sir.";
             case "Evening":
                 return "Good Evening, sir.";
             default:
                 return "Good Night, sir.";
         }
     }

     public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
     }
  }