package com.example.lab13.task1;

import java.util.Date;

class MessageSender
{
    public void send(String text, User user, String country)
    {
        if (user.getCountry().equals(country) && isActiveInNextHour(user.getLastActiveTime()))
        {
            System.out.println("Sending message to " + user.getEmail() + ": " + text);
        }
        else if(!user.getCountry().equals(country))
        {
            System.out.println("The user's country and the country specified in the message do not match");
        }
        else
        {
            System.out.println("The user " + user.getEmail() +
                    " has not been online for the last hour, the message cannot be sent");
        }
    }

    private boolean isActiveInNextHour(Date userActiveTime)
    {
        Date currentTime = new Date();
        long timeDifference = currentTime.getTime() - userActiveTime.getTime();
        return timeDifference <= 3600000;
    }
}
