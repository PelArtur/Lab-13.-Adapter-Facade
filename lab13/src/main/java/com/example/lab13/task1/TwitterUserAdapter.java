package com.example.lab13.task1;

import java.util.Date;

public class TwitterUserAdapter implements User
{
    private TwitterUser twitterUser;

    public TwitterUserAdapter(TwitterUser twitterUser)
    {
        this.twitterUser = twitterUser;
    }

    @Override
    public String getEmail()
    {
        return twitterUser.getUserMail();
    }

    @Override
    public String getCountry()
    {
        return twitterUser.getCountry();
    }

    @Override
    public Date getLastActiveTime()
    {
        return twitterUser.getLastActiveTime();
    }
}
