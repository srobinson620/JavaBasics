package com.sparta.sr;

public class App 
{
    public static void main( String[] args )
    {
        int timeOfDay = 1;
        String welcomeMessage=greeting(timeOfDay);
        System.out.println(welcomeMessage);
    }

    public static String greeting(int timeOfDay) {
        String message = "";
        if (timeOfDay >= 5 && timeOfDay <12) {
            message ="Good Morning!";
        }
        else if ( timeOfDay >= 12 && timeOfDay <=18) {
            message = "Good Afternoon!";
        }
        else if ( timeOfDay >18 && timeOfDay <=23) {
            message = "Good Evening!";
        }
        else {
            message ="Good Night!";
        }
        return message;
    }
}
