package com.example.lab13.task1;

import java.util.Date;

public class FacebookUserAdapter implements User
{
    private FacebookUser facebookUser;

    public FacebookUserAdapter(FacebookUser facebookUser)
    {
        this.facebookUser = facebookUser;
    }

    @Override
    public String getEmail()
    {
        return facebookUser.getEmail();
    }

    @Override
    public String getCountry()
    {
        return facebookUser.getUserCountry();
    }

    @Override
    public Date getLastActiveTime()
    {
        return facebookUser.getUserActiveTime();
    }
}
