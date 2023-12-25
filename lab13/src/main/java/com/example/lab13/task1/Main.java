package com.example.lab13.task1;

import java.util.Date;
import java.util.Calendar;

public class Main
{
    public static void main(String[] args)
    {
        Date currentTime = new Date();
        TwitterUser twitterUser = new TwitterUser("elon_musk@x-company.com", "South Africa", currentTime);
        FacebookUser facebookUser1 = new FacebookUser("mark_zuckerberg@fb.com", "USA", currentTime);

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentTime);
        calendar.add(Calendar.HOUR_OF_DAY, -2);
        Date twoHoursAgo = calendar.getTime();
        FacebookUser facebookUser2 = new FacebookUser("eduardo_saverin@fb.com", "Brazil", twoHoursAgo);

        User elonMusk = new TwitterUserAdapter(twitterUser);
        User markZuckerberg = new FacebookUserAdapter(facebookUser1);
        User eduardoSaverin = new FacebookUserAdapter(facebookUser2);

        MessageSender messageSender = new MessageSender();
        messageSender.send("Facebook better!", elonMusk, "South Africa");
        messageSender.send("X better!", markZuckerberg, "USA");
        messageSender.send("Oops, I entered the wrong country", markZuckerberg, "South Africa");
        messageSender.send("Why don't you go online for so long?", eduardoSaverin, "Brazil");
    }
}
